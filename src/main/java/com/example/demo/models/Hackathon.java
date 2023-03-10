package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hackathon {
	@Id
	private int rollnumber;
	private String name;
	private String department;
	private int year;
	private String email;
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Hackathon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hackathon(int rollnumber, String name, String department, int year, String email) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.department = department;
		this.year = year;
		this.email = email;
	}
	
	

}
