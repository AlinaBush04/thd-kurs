package com.example.thdkurs.repository;

import com.example.thdkurs.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepos extends JpaRepository<Post, Integer> {
    Optional<Post> findById(Integer id);
}
