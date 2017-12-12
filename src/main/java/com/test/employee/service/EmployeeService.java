package com.test.employee.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.employee.model.Company;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
 private final RestTemplate restTemplate;

    public EmployeeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "reliable")
    public Company getCompanyDetails(int companyId){
        String companyRestUrl="https://rest-itechsearch-inbred-scapegrace.cfapps.io/company/get/";
        Company company=restTemplate.getForObject(companyRestUrl+companyId,Company.class);
        return company;
    }

    public Company reliable(int companyId){
        return null;
    }

}
