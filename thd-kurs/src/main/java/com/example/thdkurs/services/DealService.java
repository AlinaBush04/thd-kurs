package com.example.thdkurs.services;

import com.example.thdkurs.models.Deal;
import com.example.thdkurs.models.Post;
import com.example.thdkurs.repository.DealRepos;
import com.example.thdkurs.repository.EmployeeRepos;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
public class DealService {
    private static DealRepos dealRepos;
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

    public void create(String name, Date data, Integer profit) {
        Optional<Deal> dealOptional = dealRepos.findById(id);
        if (dealOptional.isPresent()) {
            Deal deal = new Deal(name, data, profit);
            dealRepos.save(deal);
        }

    }

    public Object read(int id) {
        Optional<Deal> dealOptional = dealRepos.findById(id);
        if (dealOptional.isPresent()) {
            return dealOptional.get();
        }
        return null;
    }

    public void update(int id, String name, Date data, Integer profit) {
        Optional<Deal> dealOptional = dealRepos.findById(id);
        if (dealOptional.isPresent()) {
            Deal deal = dealOptional.get();
            deal.setName(name);
            deal.setData(data);
            deal.setProfit(profit);
            dealRepos.save(deal);
        }
    }
    }
}
