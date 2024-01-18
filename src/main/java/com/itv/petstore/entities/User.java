package com.itv.petstore.entities;

// import jakarta.validation.constraints.NotEmpty;
// import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class User {
    private Integer id;
    private String Firstname;
    private String lastname;
    private String email;
    private String password;
    private String confirmpassword;
    private String mobile;
    private long salary;
  
    
}
