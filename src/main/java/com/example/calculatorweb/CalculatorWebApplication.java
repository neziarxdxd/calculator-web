package com.example.calculatorweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
    @GetMapping("/hello",produces = MediaType.TEXT_PLAIN_VALUE)

    public String hello(@RequestParam Map<String,String> requestParams) {

        int num1= Integer.valueOf(requestParams.get("num1"));
        int num2 =  Integer.valueOf(requestParams.get("num2"));
        return (num1+num2).toString();
    }



}


