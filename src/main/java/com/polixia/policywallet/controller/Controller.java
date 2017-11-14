package com.polixia.policywallet.controller;


import com.polixia.policywallet.core.component.LoggerFactory;
import com.polixia.policywallet.model.Department;
import com.polixia.policywallet.model.Employee;
import com.polixia.policywallet.repository.DepartmentRepository;
import com.polixia.policywallet.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {




    @Bean
    private  LoggerFactory.Logger logger() {
        return new LoggerFactory.Logger(this.getClass());
    }

    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    LoggerFactory.Logger logger;

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/empolyyes/{id}")
    public Employee getEmployee(){
        Employee employee= employeeRepository.findByNameAndDepartmentNameAndDesignation("Bhagya","RnD","Architect");
        return employee;
    }

    @RequestMapping("/departments/{id}")
    public Department getDepartment(){
        Department department= departmentRepository.findByNameAndLocation("RnD","Kalutara");
        return department;
    }
}
