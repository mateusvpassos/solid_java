package br.com.mateus.solid.endpoint.service.readjust.segregationPrinciple;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AnualReadjust implements Readjust{

    private BigDecimal value;
    private LocalDate date;

    public AnualReadjust(BigDecimal value){
        this.value = value;
        this.date = LocalDate.now();
    }

    @Override
    public LocalDate date() {
        return date;
    }

    @Override
    public BigDecimal value() {
        return value;
    }
    
}
