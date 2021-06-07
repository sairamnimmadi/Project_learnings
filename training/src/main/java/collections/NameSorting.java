package collections;

import java.util.Comparator;

class NameSorting implements Comparator<Employee>{

	public int compare(Employee employee1, Employee employee2){
        return employee1.getName().compareTo(employee2.getName());
    }
}