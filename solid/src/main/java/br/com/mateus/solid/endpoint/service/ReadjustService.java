package br.com.mateus.solid.endpoint.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.mateus.solid.endpoint.exception.ValidationException;
import br.com.mateus.solid.endpoint.model.Employee;

public class ReadjustService {
    public void readjustEmployeeSalary(Employee employee, BigDecimal raise){
        BigDecimal salaryNow = employee.getSalary();
        BigDecimal readjustPercentage = raise.divide(salaryNow, RoundingMode.HALF_UP);
        if(readjustPercentage.compareTo(new BigDecimal("0.4")) > 0){
            throw new ValidationException("Readjust cannot be superior to 40% of the salary!");
        } 
        BigDecimal adjustedSalary = salaryNow.add(raise);
        employee.attSalary(adjustedSalary);
    }
}
