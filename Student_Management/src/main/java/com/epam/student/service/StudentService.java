package com.epam.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.student.dao.StudentRepository;
import com.epam.student.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	public void saveStudent(Student student) {
		
//		student.setId((int)studentRepository.count()+1);
		studentRepository.save(student);
	}

	public void deleteStudent(int id) {

		studentRepository.deleteById(id);	
//		int count = (int)studentRepository.count();
//		for(int i = id+1;i<=count+1;i++) {
//			Student student = studentRepository.findById(i).orElse(new Student());
//			studentRepository.deleteById(i);
//			student.setId(student.getId()-1);
//			studentRepository.save(student);
//		}
	}

	public Student getStudent(int id) {
		return studentRepository.findById(id).orElse(new Student());
	}

	public void update(Student student) {
		
		studentRepository.save(student);
	}
}