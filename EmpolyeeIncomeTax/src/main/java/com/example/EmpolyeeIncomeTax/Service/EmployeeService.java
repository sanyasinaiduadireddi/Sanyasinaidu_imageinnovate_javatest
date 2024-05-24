package com.example.EmpolyeeIncomeTax.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EmpolyeeIncomeTax.Model.EmployeeDto;
import com.example.EmpolyeeIncomeTax.Repository.EmployeeRepository;
import com.example.EmpolyeeIncomeTax.entity.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(EmployeeDto employeeDto) {

		Employee emp = new Employee();

		emp.setEmployeeId(employeeDto.getEmployeeId());
		emp.setFirstName(employeeDto.getFirstName());
		emp.setLastName(employeeDto.getLastName());
		emp.setEmail(employeeDto.getEmail());
		emp.setPhoneNumber(employeeDto.getPhoneNumber());
		emp.setDoj(employeeDto.getDoj());
		emp.setSalary(employeeDto.getSalary());

		return employeeRepository.save(emp);
	}

	@Override
	public Optional<Employee> getEmployeeById(int employeeId) {
		Optional<Employee> employee = employeeRepository.findById(employeeId);

		return employee;
	}
}
