package com.example.springboothw.servelet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ServletComponentSca , please take a look at its API doc:
// https://docs.spring.io/spring-boot/docs/current/api/org/springframework/
// boot/web/servlet/ServletComponentScan.html.


@WebServlet(
        name = "helloServlet",
        urlPatterns = "/helloServlet"
)
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) {
        System.out.println("Running Hello Servlet doGet method");
    }
}