package com.web.students.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity(name="user_token")

public class Token  extends BaseModel {
    private String value;

    private Date expiryDate;

    private boolean isDeleted;

    @ManyToOne
    private StudentEntity student;


}
