package com.itv.petstore.validator;



import org.springframework.beans.BeanWrapperImpl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class Verifypasswordvalidator implements ConstraintValidator<Verifypassword,Object> {
    private String filed;
    private String matchingFiled;

    public void initialize(Verifypassword ConstraintAnnotation)
    {
      this.filed=ConstraintAnnotation.Filed();
      this.matchingFiled=ConstraintAnnotation.matchingFiled();
    }


  @Override
    public boolean isValid(Object value, ConstraintValidatorContext context)
     {
        
       Object filedValue=new BeanWrapperImpl(value).getPropertyValue(filed);
       Object matchingFieldvalue=new BeanWrapperImpl(value).getPropertyValue(matchingFiled);
       return filedValue.equals(matchingFieldvalue);
    
    }
}
