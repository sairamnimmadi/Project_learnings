package com.epam.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
