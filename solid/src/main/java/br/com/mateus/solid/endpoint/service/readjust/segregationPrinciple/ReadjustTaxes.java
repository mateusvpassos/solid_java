package br.com.mateus.solid.endpoint.service.readjust.segregationPrinciple;

import java.math.BigDecimal;

public interface ReadjustTaxes extends Readjust{
    BigDecimal incomeTaxes();
}
