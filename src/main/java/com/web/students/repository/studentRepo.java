package com.web.students.repository;

import com.web.students.models.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface studentRepo extends JpaRepository<StudentEntity,Long> {
    Optional<> findByEmail(String email)
}
