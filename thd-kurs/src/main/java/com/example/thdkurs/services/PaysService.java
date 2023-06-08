package com.example.thdkurs.services;


import com.example.thdkurs.models.Pays;
import com.example.thdkurs.repository.PaysRepos\;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class PaysService {
    private PaysRepos paysRepos;
    public PaysService(PaysRepos paysRepos) {
        this.paysRepos = paysRepos;
    }
    public List<Pays> findAll() {
        return (List<Pays>) paysRepos.findAll();
    }
    public Optional<Pays> findById(int id) {
        return paysRepos.findById(id);
    }
    public void deleteById(int id) {
        paysRepos.deleteById(id);
    }
    public void save(Pays pays) {
        paysRepos.save(pays);
    }
}