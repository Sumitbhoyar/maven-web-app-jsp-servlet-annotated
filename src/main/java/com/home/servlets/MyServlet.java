package com.home.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/home")
public class MyServlet extends HttpServlet {
    private static int counter = 0;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setAttribute("message", "Welcome ");
        request.setAttribute("counter", ++counter);
        request.getRequestDispatcher("test.jsp").forward(request, response);
    }
}