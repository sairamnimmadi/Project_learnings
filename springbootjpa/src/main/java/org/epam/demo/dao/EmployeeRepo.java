package org.epam.demo.dao;

import java.util.List;

import org.epam.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

//	List<Employee> findByTech(String tech);
//	List<Employee> findByIdGreaterThan(int id);
//	
//	@Query("from Employee where tech=?1 order by name")
//	List<Employee> findByTechSorted(String tech);
	 
}
