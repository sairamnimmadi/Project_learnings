package org.epam.demo.dao;


import org.epam.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "employees", path="employees")
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{


	 
}
