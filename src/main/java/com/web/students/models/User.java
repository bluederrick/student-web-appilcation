package com.web.students.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="_User")
//public class User extends BaseModel {
    public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name ;

    private  String email;

  @Column(name="User_password")
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
