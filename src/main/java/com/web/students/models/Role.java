package com.web.students.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="role_user")

public class Role {
    private String name;
}
