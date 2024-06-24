package com.web.students.repository;

import com.web.students.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepo extends JpaRepository<User,Long> {
    Optional<User>findByEmail(String email);
}
