package com.example.thdkurs.repository;

import com.example.thdkurs.models.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepos extends JpaRepository<Tax, Integer> {
}
