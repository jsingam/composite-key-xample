package com.polixia.policywallet.repository;

import com.polixia.policywallet.model.Employee;
import com.polixia.policywallet.model.EmployeeId;
import org.springframework.data.repository.Repository;

public interface EmployeeRepository extends Repository<Employee,EmployeeId>{


    Employee findByNameAndDepartmentNameAndDesignation(String bhagya, String rnD, String architect);
}
