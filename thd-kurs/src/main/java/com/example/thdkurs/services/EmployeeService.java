package com.example.thdkurs.services;

import com.example.thdkurs.models.Employee;
import com.example.thdkurs.repository.EmployeeRepos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    EmployeeRepos employeeRepos;
    public EmployeeService(EmployeeRepos employeeRepos){
        this.employeeRepos = employeeRepos;
    }
    public List<Employee> findAll(){
        return (List<Employee>) employeeRepos.findAll();
    }
    public Optional<Employee> findById(int id){
        return employeeRepos.findById(id);
    }
    public void deleteById(int id){
        employeeRepos.deleteById(id);
    }
    public void save(Employee employee){
        employeeRepos.save(employee);
    }
}
