package com.prft.crud_springboot.crud_springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prft.crud_springboot.crud_springboot.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}