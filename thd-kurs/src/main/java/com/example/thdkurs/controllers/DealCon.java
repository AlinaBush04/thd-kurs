package com.example.thdkurs.controllers;

import com.example.thdkurs.models.Deal;
import com.example.thdkurs.services.DealService;
import com.example.thdkurs.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class DealCon {
    DealService dealService;

    public DealCon (DealService dealService) {
        this.dealService = dealService;
    }


    @PostMapping("/createDeal")
    public String createDeal(@RequestParam String name, @RequestParam Date data, @RequestParam Integer profit) {
        dealService.create(name, data, profit);
        return "redirect:/getDeal";
    }
    @GetMapping("/getDeal")
    public String dealTable(Model model) {
        model.addAttribute("listDeal", dealService.findAll());
        return "redirect:/Deal";
    }
    @GetMapping("/Deal/get/{id}")
    public String toEdit(@PathVariable int id, Model model){
        model.addAttribute("deal", dealService.read(id));
        return "redirect:/getDeal";
    }

    @GetMapping("Deal/delete/{id}")
    public String deleteDeal(@PathVariable int id){
        dealService.deleteById(id);
        return "redirect:/getDeal";
    }
    @PostMapping("/Deal/update/{id}")        /// изменение
    public String update(@PathVariable int id, @RequestParam String name, @RequestParam Date data, @RequestParam Integer profit) {
        dealService.update(id, name, data, profit);
        return "redirect:/getDeal";
    }

}
