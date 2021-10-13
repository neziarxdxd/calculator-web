package com.example.calculatorweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Map;

@SpringBootApplication
@RestController
public class CalculatorWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorWebApplication.class, args);
    }

    @RequestMapping("/hello/")
    public String home(HttpServletRequest request) {
        String baseUrl = ServletUriComponentsBuilder.fromRequestUri(request)
                .replacePath(null)
                .build()
                .toUriString();

        System.out.println(baseUrl);

        return "home";
    }
    @GetMapping(value = "/add", produces = MediaType.TEXT_PLAIN_VALUE)
    public String addition(@RequestParam Map<String,String> requestParams) {

        int num1=Integer.parseInt(requestParams.get("num1"));
        int num2 = Integer.parseInt(requestParams.get("num2"));
        int sum  = num1+num2;
        return "The sum of "+num1+ " and "+num2 + " is " +sum;
    }

    @PostMapping(value = "/subtract", produces = MediaType.TEXT_PLAIN_VALUE)
    public String substration(@RequestParam Map<String,String> requestParams) {

        int num1=Integer.parseInt(requestParams.get("num1"));
        int num2 = Integer.parseInt(requestParams.get("num2"));
        int difference  = num1-num2;
        return "The difference of "+num1+ " and "+num2 + " is " +difference;
    }



}


