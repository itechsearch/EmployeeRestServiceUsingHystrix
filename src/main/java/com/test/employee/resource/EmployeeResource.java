package com.test.employee.resource;

import com.test.employee.model.Employee;
import com.test.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    @Autowired
    EmployeeService employeeService;

   /* @GetMapping("/get/{id}")
    public Employee getCompanyDetails
            (@PathVariable Integer id) {
        Employee employee=new Employee();
        employee.setEmployeeid(id);
        employee.setEmployeeName("John Micheal");
        employee.setSalarty(120000);
       employee.setCompany(employeeService.getCompanyDetails(1));
        return employee;

    }
*/
    @GetMapping("/get/{id}")
    public Employee getCompanyDetails
            (@PathVariable Integer id) {
        Employee employee=new Employee();
        employee.setEmployeeid(id);
        employee.setEmployeeName("John Micheal");
        employee.setSalarty(120000);
        employee.setCompany(employeeService.getCompanyDetails(id));
        return employee;

    }


}
