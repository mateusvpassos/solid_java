package br.com.mateus.solid.endpoint.model;

import java.math.BigDecimal;

public class PersonalData {
    private String id;
    private String name;
    private String identification;
    private Role role;
    private BigDecimal salary;

    public PersonalData(String name, String identification, 
            Role role, BigDecimal salary){
        this.name = name;
        this.identification = identification;
        this.role = role;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
