package com.example.thdkurs.services;

import com.example.thdkurs.models.Commit;
import com.example.thdkurs.repository.CommitRepos;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CommitService {
    CommitRepos commitRepos;
    public CommitService(CommitRepos commitRepos){
        this.commitRepos = commitRepos;
    }
    public List<Commit> findAll(){
        return (List<Commit>) commitRepos.findAll();
    }
    public Optional<Commit> findById(int id){
        return commitRepos.findById(id);
    }
    public void deleteById(int id){
        commitRepos.deleteById(id);
    }
    public void save(Commit commit){
        commitRepos.save(commit);
    }
}
