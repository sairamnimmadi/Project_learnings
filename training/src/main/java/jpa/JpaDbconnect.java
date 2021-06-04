package jpa;
	
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDbconnect {

	public static void main(String[] args) {
		
		Employee newEmployee = new Employee();
		
		newEmployee.setId(6);
		newEmployee.setName("Dhawan");
		newEmployee.setTech("Andriod");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		manager.persist(newEmployee);
		
		manager.getTransaction().commit();
		
		Employee employee  = manager.find(Employee.class, 3);
		
		Logger logger = Logger.getLogger(JpaDbconnect.class.getName());
		
		logger.log(Level.INFO,"{0}",employee);
	
		
	}
}
