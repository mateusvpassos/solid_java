package br.com.mateus.solid.endpoint.service.promotion;

import br.com.mateus.solid.endpoint.model.Employee;

public interface ValidationPromotion {
    public void validate(Employee employee, Boolean goalAchieved);
}
