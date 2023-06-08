package com.example.thdkurs.services;

import com.example.thdkurs.models.Client;
import com.example.thdkurs.repository.ClientRepos;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ClientService {
    private ClientRepos clientRepos;
    public ClientService(ClientRepos clientRepos){
        this.clientRepos = clientRepos;
    }
    public List<Client> findAll(){
        return (List<Client>) clientRepos.findAll();
    }
    public Optional<Client> findById(int id){
        return clientRepos.findById(id);
    }
    public void deleteById(int id){
        clientRepos.deleteById(id);
    }
    public void save(Client client){
        clientRepos.save(client);
    }
}
