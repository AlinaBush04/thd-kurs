package com.example.thdkurs.services;

import com.example.thdkurs.models.Client;
import com.example.thdkurs.models.Employee;
import com.example.thdkurs.repository.ClientRepos;
import com.example.thdkurs.repository.EmployeeRepos;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ClientService {
    private static ClientRepos clientRepos;
    private static EmployeeRepos employeeRepos;

    public ClientService(ClientRepos clientRepos, EmployeeRepos employeeRepos){
        this.clientRepos = clientRepos;
        this.employeeRepos = employeeRepos;
    }
    public List<Client> findAll(){
        return (List<Client>) clientRepos.findAll();
    }
    public Optional<Client> findById(int id){
        Optional<Client> client = clientRepos.findById(id);
        if (client.isPresent()) {
            Client client1 = client.get();
            Employee employee = client1.getEmployee();
        }
        return clientRepos.findById(id);
    }
    public void deleteById(int id){
        clientRepos.deleteById(id);
    }

    public void update(int id, String full_name) {
        Optional<Client> clientOptional = clientRepos.findById(id);
        if (clientOptional.isPresent()) {
            Client client = clientOptional.get();
            client.setFull_name(full_name);
            clientRepos.save(client);
        }
    }

    public void create(String full_name, Integer employee_id) {
        Optional<Employee> employeeOptional = employeeRepos.findById(employee_id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            Client client = new Client(full_name, employee);
            clientRepos.save(client);
        }

    }

    public Object read(int id) {
        Optional<Client> clientOptional = clientRepos.findById(id);
        if (clientOptional.isPresent()) {
            return clientOptional.get();
        }
        return null;
    }
}
