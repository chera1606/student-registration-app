package servlet;

import db.DBConnection;
import model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ShowStudentsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Student> students = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                students.add(new Student(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("year")
                ));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("students", students);
        RequestDispatcher rd = request.getRequestDispatcher("students.jsp");
        rd.forward(request, response);
    }
}
