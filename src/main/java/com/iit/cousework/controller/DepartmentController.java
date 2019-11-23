package com.iit.cousework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iit.cousework.model.Department;
import com.iit.cousework.model.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
//	@PostMapping
//	public Department createDept(@RequestBody Department department) {
//		departmentRepository.save(department);
//		return department;
//	}
	@RequestMapping(value = "/abc")
    public String getHi() {
        System.out.println("End Point hit");
        departmentService.createDept();
        return "Hi";
    }
	
	

}
