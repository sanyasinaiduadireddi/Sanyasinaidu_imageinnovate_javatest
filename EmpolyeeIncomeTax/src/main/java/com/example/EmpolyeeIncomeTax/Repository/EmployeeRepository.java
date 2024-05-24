package com.example.EmpolyeeIncomeTax.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmpolyeeIncomeTax.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
