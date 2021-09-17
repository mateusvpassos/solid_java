package br.com.mateus.solid.endpoint.service.promotion;

import java.util.List;

import br.com.mateus.solid.endpoint.model.Employee;

public class PromotionService {
    private List<ValidationPromotion> validations;

    public PromotionService(List<ValidationPromotion> validations){
        this.validations = validations;
    }

    public void promoteEmployee(Employee employee, Boolean goalAchieved){

        this.validations.forEach(val -> val.validate(employee, goalAchieved));

    }
}
