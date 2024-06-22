package lk.ijse.gdse68.api;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("incoming request: "+req.getRemoteAddr());
        resp.getWriter().println("<h1 style='color: red'>Hello, I'm from HelloServlet</h1>");
    }
}
