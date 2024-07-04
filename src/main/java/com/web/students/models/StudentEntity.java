package com.web.students.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name="student_Entity")

public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private  String firstName ;
    @Column(name="last_name ")
    private String  lastName ;
    private String email;
    private String hashedPassword;
    @Column(name="matric_number")
    private String matricNumber ;

//    @ManyToMany
//    private List                                                                                                     <Role> roles;

    private boolean isEmailVerified;

    public StudentEntity() {
    }

    public StudentEntity(String firstName, String lastName, String matricNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matricNumber = matricNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public void setHashedPassword(String hashedPassword){this.hashedPassword=hashedPassword;}

    @Override
    public String toString() {
        return "studentEntity{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", matricNumber=" + matricNumber +
                '}';
    }
}
