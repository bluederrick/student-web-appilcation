package com.web.students.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LoginRequestDTO {
    private String name;

    private String email;

    private String password;
}
