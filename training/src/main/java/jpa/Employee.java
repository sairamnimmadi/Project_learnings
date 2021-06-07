package jpa;

import javax.persistence.Entity;

@Entity
public class Employee {

	@javax.persistence.Id
	private int Id;
	private String name;
	private String tech;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", tech=" + tech + "]";
	}
	
	
}
