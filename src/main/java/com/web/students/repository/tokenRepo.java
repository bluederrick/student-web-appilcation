package com.web.students.repository;

import com.web.students.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface tokenRepo  extends JpaRepository<Token, Long> {
//    custom methods

    Optional<Token>findByValueAndIsDeletedEquals( String Token ,Boolean isDeleted);
}
