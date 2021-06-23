package org.epam.demo.controller;

import java.util.List;
import java.util.Optional;

import org.epam.demo.dao.EmployeeRepo;
import org.epam.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeRepo repo;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
//	@RequestMapping("/addEmployee")
//	public String addEmployee(Employee employee) {
//		repo.save(employee);
//		return "home.jsp";
//	}
//	@RequestMapping("/getEmployee")
//	public ModelAndView getEmployee(@RequestParam int id) {
//		ModelAndView mv = new ModelAndView("showEmployee.jsp");
//		Employee emp = repo.findById(id).orElse(new Employee());
//		
//		System.out.println(repo.findByTech("java"));
//		System.out.println(repo.findByIdGreaterThan(399));
//		System.out.println(repo.findByTechSorted("java"));
//		mv.addObject("employee", emp);
//		return mv;
//	}
	// Instead of using response body we use rest controller
	
	// If you use raw data we will use Requestbody in input field
	@PostMapping(path="/employee",consumes = "application/json")
	public Employee addEmployee(@RequestBody Employee emp) {
		repo.save(emp);
		return emp;
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		
		Employee emp = repo.getById(id);
		repo.delete(emp);
		return "deleted";
	}
	
	@GetMapping(path = "/employees", produces = "application/xml")
	public List<Employee> getEmployee() {
		
		return repo.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		
		return repo.findById(id);
	}
	
	@PutMapping(path="/employee",consumes = "application/json")
	public Employee updateEmployee(@RequestBody Employee emp) {
		repo.save(emp);
		return emp;
	}
}
