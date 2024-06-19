package com.web.students.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


//a simple object that will transfer data from class to another
// we are not creating this as a table

public class SignupRequestDTO {
    private String email ;

    private String password ;

    private String userName;
}
