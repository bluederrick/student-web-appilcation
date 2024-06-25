package com.web.students.repository;

import com.web.students.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tokenRepo  extends JpaRepository<Token, Long> {
}
