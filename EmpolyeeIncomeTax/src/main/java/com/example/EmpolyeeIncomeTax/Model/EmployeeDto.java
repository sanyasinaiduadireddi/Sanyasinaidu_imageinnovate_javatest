package com.example.EmpolyeeIncomeTax.Model;

import java.io.Serializable;
import java.util.List;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class EmployeeDto implements Serializable {

	private static final long serialVersionUID = 1524710590529787384L;

	@NotBlank(message = "Employee Id shouldn't be null or empty")
	private int EmployeeId;	
	@NotBlank(message = "Employee first name shouldn't be null or empty")
	private String firstName;
	@NotBlank(message = "Employee last name shouldn't be null or empty")
	private String lastName;
	@Email(message = "Invalid email address")
	private String email;
	@Pattern(regexp = "^$|^\\d{10}$", message = "Invalid mobile number entered")
	private List<String> phoneNumber;
	@NotBlank(message = "doj shouldn't be null or empty")
	private String doj;
	@NotBlank(message = "Salary shouldn't be null or empty")
	private double salary;

	private double tax;
	private double cess;

	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getCess() {
		return cess;
	}
	public void setCess(double cess) {
		this.cess = cess;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


}
