package collections;

class Employee{

    String name;
    int experience;

    public Employee(String name, int experience){
        this.name = name;
        this.experience = experience;
    }

    public String getName(){
        return name;
    }

    public int getExperience(){
        return experience;
    }
}