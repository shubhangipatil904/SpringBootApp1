package com.SpringBoot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot1.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
