package collections;

import java.util.Arrays;

public class ComparatorExample {

    public static void main(String[] args) {

        Employee[] data = new Employee[4];
        data[0] = new Employee("Viratkohli", 13);
        data[1] = new Employee("MSDhoni", 35);
        data[2] = new Employee("SachinTendulkar", 25);
        data[3] = new Employee("ABdevillers", 17);

        //Sorting Experience

        Arrays.sort(data, new ExperienceSorting());

        for(Employee employee : data){
            System.out.println(employee.getName()+" "+employee.getExperience());
        }

        //Sorting Names

        Arrays.sort(data, new NameSorting());

        for(Employee employee : data){
            System.out.println(employee.getName()+" "+employee.getExperience());
        }
        
    }
}