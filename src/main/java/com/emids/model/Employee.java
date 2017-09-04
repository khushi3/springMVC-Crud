package com.emids.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")

public class Employee {
	   @Id
	   @Column(name = "id")
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int id;

	   @Column(name = "Ename")
	   private String Ename;

	   @Column(name = "Address")
	   private String Address;

	   @Column(name = "salary")
	   private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String ename, String address, int salary) {
		super();
		this.id = id;
		Ename = ename;
		Address = address;
		this.salary = salary;
	}
	
	

}
