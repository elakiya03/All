package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.Employee;

//Bydefault spring data jpa made jpaRepository method transactional so we no need to add @transactional annotation in service class



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
