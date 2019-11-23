package com.iit.cousework.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iit.cousework.model.Department;
import com.iit.cousework.repository.DepartmentRepository;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepository departmentRepository ;
	
	@Override
	public Department createDept() {
		// TODO Auto-generated method stub
		Department department=new Department();
		department.setName("sdcscs");
		department.setId("123");
		department.setDescription("sdfsdfsdfsdfs");
		departmentRepository.save(department);
		return department;
	}

}
