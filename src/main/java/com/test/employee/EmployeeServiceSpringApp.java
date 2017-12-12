package com.test.employee;

import com.test.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class EmployeeServiceSpringApp {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceSpringApp.class,args);
    }

    @Autowired
    private EmployeeService employeeService;

    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }
}
