package com.example.thdkurs.services;

import com.example.thdkurs.models.Employee;
import com.example.thdkurs.models.Post;
import com.example.thdkurs.repository.PostRepos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PostService {
    private static PostRepos postRepos;

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

    public void create(String name, Integer bet) {
        Optional<Post> postOptional = postRepos.findById(id);
        if (postOptional.isPresent()) {
            Post post = new Post(name, bet);
            postRepos.save(post);
        }

    }

    public Object read(int id) {
        Optional<Post> postOptional = postRepos.findById(id);
        if (postOptional.isPresent()) {
            return postOptional.get();
        }
        return null;
    }

    public void update(int id, String name, Integer bet) {
        Optional<Post> postOptional = postRepos.findById(id);
        if (postOptional.isPresent()) {
            Post post = postOptional.get();
            post.setName(name);
            post.setBet(bet);
            postRepos.save(post);
        }
    }
}
