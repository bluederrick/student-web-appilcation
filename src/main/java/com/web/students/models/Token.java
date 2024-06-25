package com.web.students.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

import java.util.Date;

@Entity(name="user_token")

public class Token  extends BaseModel {
    @Getter
    private String value;

    @Getter
    private Date expiryDate;

    private boolean isDeleted;

    @Getter
    @ManyToOne
    private StudentEntity student;

    @Getter
    @ManyToOne
    private User user;

    public Token(String value, Date expiryDate, boolean isDeleted, StudentEntity student, User user) {
        this.value = value;
        this.expiryDate = expiryDate;
        this.isDeleted = isDeleted;
        this.student = student;
        this.user = user;
    }

    public Token() {

    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
