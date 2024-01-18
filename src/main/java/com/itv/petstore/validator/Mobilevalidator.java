package com.itv.petstore.validator;



import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class Mobilevalidator  implements ConstraintValidator<Mobile,String>{

    

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
  
        boolean condition=value.length()==10 && value.matches("[0-9]+");
        return condition;
    }
}

