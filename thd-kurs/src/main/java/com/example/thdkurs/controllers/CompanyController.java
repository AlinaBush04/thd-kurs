package com.example.thdkurs.controllers;

import com.example.thdkurs.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CompanyController {
    ClientService clientService;
    CommitService commitService;
    DealService dealService;
    EmployeeService employeeService;
    PaysService paysService;
    PostService postService;
    TaxService taxService;

    public CompanyController(ClientService clientService, CommitService commitService, DealService dealService, EmployeeService employeeService, PaysService paysService, PostService postService, TaxService taxService){
        this.clientService = clientService;
        this.commitService = commitService;
        this.dealService = dealService;
        this.employeeService = employeeService;
        this.paysService = paysService;
        this.postService = postService;
        this.taxService = taxService;
    }
    @GetMapping("/")
    public String companyPage() {
        return "company";
    }



}
