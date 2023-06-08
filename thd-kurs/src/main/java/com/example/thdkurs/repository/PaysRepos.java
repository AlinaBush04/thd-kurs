package com.example.thdkurs.repository;

import com.example.thdkurs.models.Pays;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepos extends CrudRepository<Pays, Integer> {
}
