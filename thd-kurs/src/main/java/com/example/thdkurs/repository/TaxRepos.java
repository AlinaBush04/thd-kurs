package com.example.thdkurs.repository;

import com.example.thdkurs.models.Tax;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepos extends CrudRepository<Tax, Integer> {
}
