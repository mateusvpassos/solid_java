package br.com.mateus.solid.endpoint.model;

import java.math.BigDecimal;

public class Outsourced {

    private PersonalData personalData;
    private String company;

    public Outsourced(String name, String identification, 
        Role role, BigDecimal salary, String company) {
        this.personalData = new PersonalData(name, identification, role, salary);
        this.company = company;
    }
    
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }
}
