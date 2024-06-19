package com.web.students.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
// this annotation means this will not be mapped or persisted to the database;
//we are saying to the jpa , we do not need to create a table for this class on the databse

public class BaseModel {
    @Id
//   @ID tells jpa this is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
}
