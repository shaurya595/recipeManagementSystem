package com.geekster.recipeManagementSystem.controllers;

import com.geekster.recipeManagementSystem.models.Chef;
import com.geekster.recipeManagementSystem.models.Recipie;
import com.geekster.recipeManagementSystem.services.RecipieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipie")
public class RecipieController {
    @Autowired
    RecipieService recipieService;
    @PostMapping()
    public void addRecipie(@RequestBody Recipie recipie){
        recipieService.insertRecipie(recipie);
    }
    @GetMapping()
    public Iterable<Recipie> getRecipie(){
        return recipieService.getAllRecipie();
    }
    @DeleteMapping (value = "recipieid/{id}")
    public void deleteRecipieById(@PathVariable Integer id){
        recipieService.removeRecipieById(id);
    }


}
