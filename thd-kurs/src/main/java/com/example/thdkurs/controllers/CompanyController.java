package com.example.thdkurs.controllers;

import com.example.thdkurs.models.*;
import com.example.thdkurs.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.ParseException;
import java.util.Date;


@Controller
public class CompanyController {
    ClientService clientService;
    CommitService commitService;
    DealService dealService;
    EmployeeService employeeService;
    PaysService paysService;
    PostService postService;
    TaxService taxService;

    public CompanyController(ClientService clientService, CommitService holderStatusService, DealService dealService, EmployeeService employeeService, PaysService paysService, PostService postService, TaxService taxService){
        this.clientService = clientService;
        this.commitService = holderStatusService;
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

    @GetMapping("/client")
    public String clientTable(Model model) {
        model.addAttribute("listClient", clientService.findAll());
        return "clientTable";
    }
    @GetMapping("/employee")
    public String employeeTable(Model model) {
        model.addAttribute("listPaper", employeeService.findAll());
        return "employeeTable";
    }

}
