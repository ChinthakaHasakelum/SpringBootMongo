package com.iit.cousework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.iit.cousework.model.service.DepartmentService;

@SpringBootApplication
@ComponentScan("com.iit")
public class VehiclerentsystemApplication {

	
	@Autowired
	DepartmentService departmentService;
	public static void main(String[] args) {
		SpringApplication.run(VehiclerentsystemApplication.class, args);
		
		
	}

}
