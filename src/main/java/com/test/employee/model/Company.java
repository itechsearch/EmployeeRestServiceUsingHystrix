package com.test.employee.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Company implements Serializable
{
    private static final long serialVersionUID=-1234567890L;

    private Integer companyId;

    private String name;

    private Integer CMMILevel;

    private Integer employeeCount;


    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCMMILevel() {
        return CMMILevel;
    }

    public void setCMMILevel(Integer CMMILevel) {
        this.CMMILevel = CMMILevel;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }



}
