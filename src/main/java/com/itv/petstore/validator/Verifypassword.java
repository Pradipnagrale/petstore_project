package com.itv.petstore.validator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy=Verifypasswordvalidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface  Verifypassword {
    
    String message ()default "password and confirmed password not match";
     Class<?>[]groups()default{};
    Class<? extends Payload>[]payload()default{};
    String  Filed();
    String matchingFiled();
}
    

