package com.example.EmpolyeeIncomeTax.Service;

import java.util.Optional;

import com.example.EmpolyeeIncomeTax.Model.EmployeeDto;
import com.example.EmpolyeeIncomeTax.entity.Employee;

public interface IEmployeeService {
	public Optional<Employee> getEmployeeById(int employeeId);
	public Employee saveEmployee(EmployeeDto employeeDto);
}
