package com.example.thdkurs.repository;

import com.example.thdkurs.models.Commit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommitRepos extends CrudRepository<Commit, Integer> {
}
