package com.web.students.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
    private String name ;

    @Column(name="email")
    private  String email;

    @Column(name="password")
    private String password ;

    @ManyToMany
    private List<Role> role;
//   user can have many roles and roles can have many users

    private String isEmailVerified;
}
