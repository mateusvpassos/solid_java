package br.com.mateus.solid.endpoint.service.readjust;

import java.math.BigDecimal;
import java.util.List;

import br.com.mateus.solid.endpoint.model.Employee;

public class ReadjustService {

    private List<ValidationReadjust> validations;

    public ReadjustService(List<ValidationReadjust> validations){
        this.validations = validations;
    }

    public void readjustEmployeeSalary(Employee employee, BigDecimal raise){

        this.validations.forEach(val -> val.validate(employee, raise));

        BigDecimal adjustedSalary = employee.getSalary().add(raise);
        employee.attSalary(adjustedSalary);
    }
}
