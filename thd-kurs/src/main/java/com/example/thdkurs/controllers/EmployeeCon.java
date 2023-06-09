package com.example.thdkurs.controllers;

import com.example.thdkurs.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class EmployeeCon {
    EmployeeService employeeService;

    public EmployeeCon (EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/createEmployee")
    public String createEmployee(@RequestParam String full_name, @RequestParam Integer post_id) {
        employeeService.create(full_name, post_id);
        return "redirect:/getEmployee";
    }
    @GetMapping("/getEmployee")
    public String employeeTable(Model model) {
        model.addAttribute("listEmployee", employeeService.findAll());
        return "redirect:/employee";
    }
    @GetMapping("/employee/get/{id}")
    public String toEdit(@PathVariable int id, Model model){
        model.addAttribute("employee", employeeService.read(id));
        return "redirect:/getEmployee";
    }

    @GetMapping("employee/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        employeeService.deleteById(id);
        return "redirect:/getEmployee";
    }
    @PostMapping("/employee/update/{id}")        /// изменение
    public String update(@PathVariable int id, @RequestParam String full_name) {
        employeeService.update(id, full_name);
        return "redirect:/getEmployee";
    }

}
