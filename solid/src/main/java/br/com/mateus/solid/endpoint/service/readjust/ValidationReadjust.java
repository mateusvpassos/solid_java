package br.com.mateus.solid.endpoint.service.readjust;

import java.math.BigDecimal;

import br.com.mateus.solid.endpoint.model.Employee;

public interface ValidationReadjust {
    public void validate(Employee employee, BigDecimal raise);
}
