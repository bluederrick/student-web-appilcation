package com.web.students.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="User")
public class User                                                                                                                                                                                                  User extends BaseModel {
    private String name ;

    @Column(name="UserEmail")
    private  String email;

    @Column(name="User-password")
    private String password ;

    @ManyToMany
    private List<Role> role;
//   user can have many roles and roles can have many users

    private String isEmailVerified;

    public User(String name, String email, String password, List<Role> role, String isEmailVerified) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.isEmailVerified = isEmailVerified;
    }


}
