package br.com.mateus.solid.endpoint.service.promotion;

import br.com.mateus.solid.endpoint.exception.ValidationException;
import br.com.mateus.solid.endpoint.model.Employee;
import br.com.mateus.solid.endpoint.model.Role;

public class ValidationManagerPromotion implements ValidationPromotion{

    public void validate(Employee employee, Boolean goalAchieved) {
        if(employee.getRole() == Role.MANAGER){
            throw new ValidationException("Managers cannot be promoted");
        }
    }
    
}
