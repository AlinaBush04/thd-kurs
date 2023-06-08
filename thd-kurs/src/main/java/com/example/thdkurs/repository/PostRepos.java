package com.example.thdkurs.repository;

import com.example.thdkurs.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepos extends CrudRepository<Post, Integer> {
}
