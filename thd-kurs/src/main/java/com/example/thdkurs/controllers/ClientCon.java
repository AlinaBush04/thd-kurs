package com.example.thdkurs.controllers;

import com.example.thdkurs.services.ClientService;
import com.example.thdkurs.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientCon {
    ClientService clientService;

    public ClientCon (ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/createClient")
    public String createClient(@RequestParam String full_name, @RequestParam Integer post_id) {
        clientService.create(full_name, post_id);
        return "redirect:/getClient";
    }
    @GetMapping("/getClient")
    public String clientTable(Model model) {
        model.addAttribute("listClient", clientService.findAll());
        return "redirect:/Client";
    }
    @GetMapping("/Client/get/{id}")
    public String toEdit(@PathVariable int id, Model model){
        model.addAttribute("client", clientService.read(id));
        return "redirect:/getClient";
    }

    @GetMapping("Client/delete/{id}")
    public String deleteClient(@PathVariable int id){
        clientService.deleteById(id);
        return "redirect:/getClient";
    }
    @PostMapping("/Client/update/{id}")        /// изменение
    public String update(@PathVariable int id, @RequestParam String full_name) {
        clientService.update(id, full_name);
        return "redirect:/getClient";
    }

}
