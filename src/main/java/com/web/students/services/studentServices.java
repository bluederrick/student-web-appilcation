package com.web.students.services;

import com.web.students.models.StudentEntity;
import com.web.students.repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class studentServices {


    @Autowired
    studentRepo StudentRepo;

    StudentEntity studentEntity;

    public studentServices(studentRepo studentRepo) {
        StudentRepo = studentRepo;
    }

    public Optional<StudentEntity> saveStudent(String userName , String firstName , String lastName , String email ,String hashedPassword ,String matricNumber ) {

            Optional< StudentEntity> isExist;
            isExist = StudentRepo.findByEmail(email);
            if (isExist.isPresent()) {
                System.out.println("user already exist");;
            }
//        System.out.println("user is saved successfully");;

        studentEntity.setFirstName(studentEntity.getFirstName());
        studentEntity.setLastName(studentEntity.getLastName());
        studentEntity.setMatricNumber(studentEntity.getMatricNumber());
        studentEntity.setHashedPassword(studentEntity.getHashedPassword());

        return  StudentRepo.save(StudentEntity);

    }

}
