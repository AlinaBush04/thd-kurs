package com.example.thdkurs.repository;

import com.example.thdkurs.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepos extends CrudRepository<Client, Integer> {
}
