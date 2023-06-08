package com.example.thdkurs.services;

import com.example.thdkurs.models.Post;
import com.example.thdkurs.repository.PostRepos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PostService {
    PostRepos postRepos;
    public PostService(PostRepos postRepos){
        this.postRepos = postRepos;
    }
    public List<Post> findAll() {
        return (List<Post>) postRepos.findAll();
    }
    public Optional<Post> findById(int id){
        return postRepos.findById(id);
    }
    public void deleteById(int id){
        postRepos.deleteById(id);
    }
    public void save(Post post){
        postRepos.save(post);
    }
}
