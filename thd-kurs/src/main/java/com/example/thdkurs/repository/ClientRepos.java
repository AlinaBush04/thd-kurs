package com.example.thdkurs.repository;

import com.example.thdkurs.models.Client;
import com.example.thdkurs.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepos extends JpaRepository<Client, Integer> {
    Optional<Client> findById(Integer id);
}
