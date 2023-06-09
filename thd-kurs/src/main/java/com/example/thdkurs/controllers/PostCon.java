package com.example.thdkurs.controllers;

import com.example.thdkurs.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostCon {
    PostService postService;
    public PostCon (PostService postService) {
        this.postService = postService;
    }
    @PostMapping("/createPost")
    public String createPost(@RequestParam String name, @RequestParam Integer bet) {
        postService.create(name, bet);
        return "redirect:/getPost";
    }
    @GetMapping("/getPost")
    public String postTable(Model model) {
        model.addAttribute("listPost", postService.findAll());
        return "redirect:/Post";
    }
    @GetMapping("/Post/get/{id}")
    public String toEdit(@PathVariable int id, Model model){
        model.addAttribute("post", postService.read(id));
        return "redirect:/getPost";
    }

    @GetMapping("/Post/delete/{id}")
    public String deletePost(@PathVariable int id){
        postService.deleteById(id);
        return "redirect:/getPost";
    }
    @PostMapping("/Post/update/{id}")        /// изменение
    public String update(@PathVariable int id, @RequestParam String name, @RequestParam Integer bet) {
        postService.update(id, name, bet);
        return "redirect:/getPost";
    }

}
