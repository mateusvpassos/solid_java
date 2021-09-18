package br.com.mateus.solid.endpoint.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    
    private PersonalData personalData;
    private LocalDate lastReadjustDate;

    public Employee(String name, String identification, 
            Role role, BigDecimal salary){
        this.personalData = new PersonalData(name, identification, role, salary);
    }

    public void attSalary(BigDecimal newSalary){
        this.personalData.setSalary(newSalary);
        this.lastReadjustDate = LocalDate.now();
    }

    public void promote(Role newRole) {
        this.personalData.setRole(newRole);
    }

    public LocalDate getLastReadjustDate() {
        return lastReadjustDate;
    }

    public void setLastReadjustDate(LocalDate lastReadjustDate) {
        this.lastReadjustDate = lastReadjustDate;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }
    
    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }
}
