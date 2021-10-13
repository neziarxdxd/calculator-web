package com.example.calculatorweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;

@SpringBootApplication
@RestController
public class CalculatorWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorWebApplication.class, args);
    }
    @GetMapping(value = "/add", produces = MediaType.TEXT_PLAIN_VALUE)

    public String hello(@RequestParam Map<String,String> requestParams) {

        int num1=Integer.parseInt(requestParams.get("num1"));
        int num2 = Integer.parseInt(requestParams.get("num2"));
        int sum  = num1+num2;
        return "The sum of "+num1+ " and "+num2 + " is " +sum;
    }



}


