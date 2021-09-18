package br.com.mateus.solid.endpoint.service.readjust.segregationPrinciple;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Readjust {
    LocalDate date();
    BigDecimal value();
}
