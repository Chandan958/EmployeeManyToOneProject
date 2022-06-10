package com.rk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
