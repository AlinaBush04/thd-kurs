package com.example.thdkurs.repository;

import com.example.thdkurs.models.Commit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommitRepos extends JpaRepository<Commit, Integer> {
}
