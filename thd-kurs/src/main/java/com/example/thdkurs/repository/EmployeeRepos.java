package com.example.thdkurs.repository;

import com.example.thdkurs.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepos extends JpaRepository<Employee, Integer> {
    Optional<Employee> findById(Integer id);

}
