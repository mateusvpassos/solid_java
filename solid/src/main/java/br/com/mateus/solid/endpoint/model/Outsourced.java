package br.com.mateus.solid.endpoint.model;

import java.math.BigDecimal;

public class Outsourced extends Employee{

    private String company;

    public Outsourced(String name, String identification, Role role, BigDecimal salary) {
        super(name, identification, role, salary);
    }
    
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
