package collections;

import java.util.Comparator;

class ExperienceSorting implements Comparator<Employee>{

	
    public int compare(Employee employee1, Employee employee2){
        return employee1.getExperience() - employee2.getExperience();
    }
    
}