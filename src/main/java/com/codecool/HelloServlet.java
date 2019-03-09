package com.codecool;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<B>Congratulation, our sales team will contact you on the following email adress: ");
        pw.println(email);
        pw.close();
    }
}