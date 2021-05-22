package com.thaiprogramer.ooplab;

public class Ceo extends Employee {
	public Ceo(String firstNameInput, String lastNameInput, int salaryInput) {
		super(firstNameInput, lastNameInput, salaryInput);
	}
	
	public int getSalary() {
		return super.getSalary() * 2;
	}
}
