package com.example.thdkurs.controllers;

import com.example.thdkurs.services.TaxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class TaxCon {
        TaxService taxService;

        public TaxCon (TaxService taxService) {
            this.taxService = taxService;
        }

        @PostMapping("/createTax")
        public String createTax(@RequestParam Integer tax_deduction) {
            taxService.create(tax_deduction);
            return "redirect:/getTax";
        }
        @GetMapping("/getTax")
        public String taxTable(Model model) {
            model.addAttribute("listTax", taxService.findAll());
            return "redirect:/Tax";
        }
        @GetMapping("/Tax/get/{id}")
        public String toEdit(@PathVariable int id, Model model){
            model.addAttribute("tax", taxService.read(id));
            return "redirect:/getTax";
        }

        @GetMapping("Tax/delete/{id}")
        public String deleteTax(@PathVariable int id){
            taxService.deleteById(id);
            return "redirect:/getTax";
        }
        @PostMapping("/Tax/update/{id}")        /// изменение
        public String update(@PathVariable int id, @RequestParam Integer tax_deduction) {
            taxService.update(id, tax_deduction);
            return "redirect:/getTax";
        }
}
