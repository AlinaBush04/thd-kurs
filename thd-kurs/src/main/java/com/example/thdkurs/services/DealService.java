package com.example.thdkurs.services;

import com.example.thdkurs.models.Deal;
import com.example.thdkurs.repository.DealRepos;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class DealService {
    DealRepos dealRepos;
    public DealService(DealRepos dealRepos){
        this.dealRepos = dealRepos;
    }
    public List<Deal> findAll(){
        return (List<Deal>) dealRepos.findAll();
    }
    public Optional<Deal> findById(int id){
        return dealRepos.findById(id);
    }
    public void deleteById(int id){
        dealRepos.deleteById(id);
    }
    public void save(Deal deal){
        dealRepos.save(deal);
    }
}
