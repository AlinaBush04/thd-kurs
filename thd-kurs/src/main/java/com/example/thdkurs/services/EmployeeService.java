package com.example.thdkurs.services;

import com.example.thdkurs.models.Employee;
import com.example.thdkurs.models.Post;
import com.example.thdkurs.repository.EmployeeRepos;
import com.example.thdkurs.repository.PostRepos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private static EmployeeRepos employeeRepos;
    private static PostRepos postRepos;

    public EmployeeService(EmployeeRepos employeeRepos, PostRepos postRepos){
        this.employeeRepos = employeeRepos;
        this.postRepos = postRepos;
    }
    public List<Employee> findAll(){
        return (List<Employee>) employeeRepos.findAll();
    }
    public Optional<Employee> findById(int id){
        Optional<Employee> employee = employeeRepos.findById(id);
        if (employee.isPresent()) {
            Employee employee1 = employee.get();
            Post post = employee1.getPost();
        }
        return employeeRepos.findById(id);
    }
    public void deleteById(int id){
        employeeRepos.deleteById(id);
    }
    public Employee read(int id) {
        Optional<Employee> employeeOptional = employeeRepos.findById(id);
        if (employeeOptional.isPresent()) {
            return employeeOptional.get();
        }
        return null;
    }

    public void create(String full_name, Integer post_id) {
        Optional<Post> postOptional = postRepos.findById(post_id);
        if (postOptional.isPresent()) {
            Post post = postOptional.get();
            Employee employee = new Employee(full_name, post);
            employeeRepos.save(employee);
        }

    }

    public void update(int id, String full_name) {
        Optional<Employee> employeeOptional = employeeRepos.findById(id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            employee.setFull_name(full_name);
            employeeRepos.save(employee);
        }
    }
}
