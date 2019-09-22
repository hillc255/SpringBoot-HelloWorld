package com.example.springboothw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
/*mvnw boot:run
 mvnw boot:run
 mvn spring-boot:run */

//run this command:  mvn spring-boot:run
//in terminal here:  C:\Users\Claudia\Intellij\Spring\SB-HelloWorld
//http://localhost:8080/hello

@RestController
public class HelloController {
    private Map<String, Object> result = new HashMap<>();

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello() {
        result.put("name", "Stephen");
        result.put("city", "San Jose");
        return result;
    }
}
