package br.com.mateus.solid.endpoint.service.promotion;

import br.com.mateus.solid.endpoint.exception.ValidationException;
import br.com.mateus.solid.endpoint.model.Employee;
import br.com.mateus.solid.endpoint.model.Role;

public class ValidationGoalPromotion implements ValidationPromotion{

    public void validate(Employee employee, Boolean goalAchieved) {
        if(goalAchieved){
            Role newRole = employee.getRole().nextRole();
            employee.promote(newRole);
        }else{
            throw new ValidationException("Goal did not be achieved");
        }
    }
    
}
