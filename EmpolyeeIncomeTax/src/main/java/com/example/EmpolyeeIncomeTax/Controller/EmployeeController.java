package com.example.EmpolyeeIncomeTax.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.EmpolyeeIncomeTax.Model.EmployeeDto;
import com.example.EmpolyeeIncomeTax.Service.IEmployeeService;
import com.example.EmpolyeeIncomeTax.entity.Employee;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/employeetax")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService iemployeeService;
	
	@PostMapping("/signup")
	public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
		return new ResponseEntity<>(iemployeeService.saveEmployee(employeeDto), HttpStatus.CREATED);
	}
	
	@GetMapping("/employee/{id}")
    public ResponseEntity<Optional<Employee>> fetchEmployeeById(@PathVariable("employeeId") int employeeId) {
		return new ResponseEntity<>(iemployeeService.getEmployeeById(employeeId), HttpStatus.OK);
    }

}
