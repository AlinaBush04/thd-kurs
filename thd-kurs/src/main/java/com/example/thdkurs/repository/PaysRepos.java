package com.example.thdkurs.repository;

import com.example.thdkurs.models.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepos extends JpaRepository<Pays, Integer> {
}
