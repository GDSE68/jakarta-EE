package lk.ijse.gdse68.api;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
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

        // servlet config is specific to one servlet
        // Holds initialization parameters and configuration for a specific servlet
        ServletConfig config = getServletConfig();
        String city = config.getInitParameter("city");
        System.out.println("HelloServlet: " + city);

        //servlet context is common to all servlets
        // Holds initialization parameters and configuration common to the entire application (all servlets)
        ServletContext context = getServletContext();
        String country = context.getInitParameter("country");
        System.out.println("HelloServlet: " + country);
    }
}
