package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimeraTareaApplication {
    @RequestMapping("/demo")
    static int suma(Integer x){

        Integer y=0;
        for (Integer i =0;i<=x;i++){
            y= x*(x+1)/2;

        }
        return y;

    }

    public static void main(String[] args)
    {
        SpringApplication.run(PrimeraTareaApplication.class, args);
        System.out.println(suma(2));

    }

}









