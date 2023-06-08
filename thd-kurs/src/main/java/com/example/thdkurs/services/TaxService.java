package com.example.thdkurs.services;

import com.example.thdkurs.models.Tax;
import com.example.thdkurs.repository.TaxRepos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaxService {
    TaxRepos taxRepos;
    public TaxService(TaxRepos taxRepos){
        this.taxRepos = taxRepos;
    }
    public List<Tax> findAll(){
        return (List<Tax>) taxRepos.findAll();
    }
    public Optional<Tax> findById(int id){
        return taxRepos.findById(id);
    }
    public void deleteById(int id){
        taxRepos.deleteById(id);
    }
    public void save(Tax tax){
        taxRepos.save(tax);
    }
}
