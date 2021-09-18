package br.com.mateus.solid.endpoint.service.readjust.segregationPrinciple;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PromotionReadjust implements ReadjustTaxes{

    private BigDecimal value;
    private LocalDate date;

    public PromotionReadjust(BigDecimal value){
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

    @Override
    public BigDecimal incomeTaxes() {
        return value.multiply(new BigDecimal("0.1"));
    }
    
}
