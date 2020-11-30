package com.codeclan.example.EmployeeLab;

import com.codeclan.example.EmployeeLab.models.Employee;
import com.codeclan.example.EmployeeLab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {

		Employee json = new Employee("Json", "Jsonson", 101, "6412242", "json@jsonson.com");
		Employee graham = new Employee("Graham", "Grahamson", 29, "876152638", "Graeme@grahamson.com");

		employeeRepository.save(json);
		employeeRepository.save(graham);

	}

}
