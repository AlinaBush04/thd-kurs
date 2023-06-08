package com.example.thdkurs.repository;

import com.example.thdkurs.models.Deal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealRepos extends CrudRepository<Deal, Integer> {
}
