package com.example.springboothw.filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.Filter;

//filter component used to preprocess and postprocessing requests
//validate, encrypt/decrypt, log requests

@WebFilter(filterName = "helloFilter", urlPatterns = "/helloServlet")
public abstract class HelloFilter implements Filter{

    private void doFilter(ServletRequest servletRequest,
                          ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("Executing doFilter method");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Done executing doFilter method");
    }

}