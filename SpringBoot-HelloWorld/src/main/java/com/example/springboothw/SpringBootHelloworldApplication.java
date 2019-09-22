package com.example.springboothw;

import com.example.springboothw.filter.HelloFilter;
import com.example.springboothw.listener.HelloListener;
import com.example.springboothw.servelet.HelloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//servlet used to handle requests
//Stop (Control + C)
//mvn spring-boot:run
//http://localhost:8080/helloServlet
//this returns a blank screen but console has printout

//@ServletComponentScan
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloworldApplication.class, args);
    }


    /// Register Servlet.
    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean servletBean =
                new ServletRegistrationBean(new HelloServlet());
        servletBean.addUrlMappings("/helloServlet");
        servletBean.setLoadOnStartup(1);
        return servletBean;
    }

    /// Register Filter
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean filterBean = new FilterRegistrationBean();
        filterBean.setFilter(new HelloFilter());
        filterBean.addUrlPatterns("/helloServlet");
        // Add filter path
        filterBean.setName("helloFilter");
        filterBean.setOrder(1);
        return filterBean;
    }


    @Bean
    public ServletListenerRegistrationBean<HelloListener> getServletListenerRegistrationBean() {
        ServletListenerRegistrationBean listenerBean =
                new ServletListenerRegistrationBean(new HelloListener());
        return listenerBean;
    }


}
