package com.example.thdkurs.repository;

import com.example.thdkurs.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepos extends CrudRepository<Employee, Integer> {
}
