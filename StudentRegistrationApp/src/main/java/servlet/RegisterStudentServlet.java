package servlet;

import db.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        int year = Integer.parseInt(request.getParameter("year"));

        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO students (name, email, year) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, year);

            ps.executeUpdate();
            con.close();

            response.sendRedirect("show");

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: Email already exists.");
        }
    }
}
