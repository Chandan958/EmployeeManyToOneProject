package com.rk.datarunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.Model.Dept;
import com.rk.Model.Employee;
import com.rk.repo.DeptRepository;
import com.rk.repo.EmployeeRepository;

@Component
public class ManyToOneRunner implements CommandLineRunner{
	@Autowired
	private DeptRepository drepo;
	@Autowired
	private EmployeeRepository erepo;

	@Override
	public void run(String... args) throws Exception {
		Dept d1 = new Dept(10, "CS", "chandan");
		drepo.save(d1);
		Employee e = new Employee(1, "kiran", 2.2, d1);
		Employee e1 = new Employee(2, "kundan", 3.2, d1);
		Employee e2 = new Employee(3, "shiv", 5.2, d1);
		erepo.save(e);
		erepo.save(e1);
		erepo.save(e2);
		
		
		
	}
	

}
