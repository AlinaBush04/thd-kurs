package com.example.thdkurs.services;

import com.example.thdkurs.models.Post;
import com.example.thdkurs.models.Tax;
import com.example.thdkurs.repository.TaxRepos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaxService {

    private static TaxRepos taxRepos;
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
    public void create(Integer tax_deduction) {
        Optional<Tax> taxOptional = taxRepos.findById(id);
        if (taxOptional.isPresent()) {
            Tax tax = new Tax(tax_deduction);
            taxRepos.save(tax);
        }

    }

    public Object read(int id) {
        Optional<Tax> taxOptional = taxRepos.findById(id);
        if (taxOptional.isPresent()) {
            return taxOptional.get();
        }
        return null;
    }

    public void update(int id, Integer tax_deduction) {
        Optional<Tax> taxOptional = taxRepos.findById(id);
        if (taxOptional.isPresent()) {
            Tax tax = taxOptional.get();
            tax.setTax_deduction(tax_deduction;
            taxRepos.save(tax);
        }
    }
}
