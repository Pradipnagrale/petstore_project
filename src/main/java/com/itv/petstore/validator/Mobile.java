package com.itv.petstore.validator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
// import javax.swing.text.html.parser.Element;


@Constraint(validatedBy=Mobilevalidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Mobile {

    String message()default "invalid mobile no ";
    Class<?>[]groups()default{};
    Class<? extends Payload>[]payload()default{};
    
}
