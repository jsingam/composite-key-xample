package com.polixia.policywallet.repository;

import com.polixia.policywallet.model.Department;
import com.polixia.policywallet.model.DepartmentId;
import org.springframework.data.repository.Repository;

public interface DepartmentRepository extends Repository<Department,DepartmentId> {
    Department findByNameAndLocation(String name,String location);
}
