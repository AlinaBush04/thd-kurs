package com.example.thdkurs.repository;

import com.example.thdkurs.models.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealRepos extends JpaRepository<Deal, Integer> {
}
