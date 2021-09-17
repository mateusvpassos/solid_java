package br.com.mateus.solid.endpoint.service.readjust;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.mateus.solid.endpoint.exception.ValidationException;
import br.com.mateus.solid.endpoint.model.Employee;

public class ValidationMonthsReadjust implements ValidationReadjust{
    public void validate(Employee employee, BigDecimal raise){
        LocalDate lastReadjust = employee.getLastReadjustDate();
        LocalDate today = LocalDate.now();
        Long monthsSinceLastReadjust = ChronoUnit.MONTHS.between(lastReadjust, today);
        if(monthsSinceLastReadjust < 6){
            throw new ValidationException("The last readjust of salary was in less than six months");
        }
    }
}
