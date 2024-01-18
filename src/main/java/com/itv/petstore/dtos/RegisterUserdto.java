package com.itv.petstore.dtos;

import com.itv.petstore.validator.Verifypassword;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Verifypassword(Filed = "password", matchingFiled = "confirmpassword")
public class RegisterUserdto {

    private Integer id;
    @NotNull @NotEmpty
    @Size(min = 4,max = 10,message = "firstname should have length bet 4 to 10")
    private String Firstname;
    private String lastname;
    @NotNull @NotEmpty
    private String email;

   
    private String password;
    private String confirmpassword;

    @com.itv.petstore.validator.Mobile
    private String mobile;
    @Min(value=10000,message="min salary should be 10000")
    @Max(value=100000,message="mmax salary should be 100000")

    private long salary;

    
}
