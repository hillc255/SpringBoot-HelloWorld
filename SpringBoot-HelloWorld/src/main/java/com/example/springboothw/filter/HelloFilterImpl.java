package com.example.springboothw.filter;

import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.HttpExchange;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public interface HelloFilterImpl {
    void doFilter(ServletRequest servletRequest,
                  ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException;

    void doFilter(HttpExchange httpExchange, Filter.Chain chain) throws IOException;

    String description();
}
