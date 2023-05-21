package com.geekster.recipeManagementSystem.controllers;

import com.geekster.recipeManagementSystem.models.Chef;
import com.geekster.recipeManagementSystem.models.Recipie;
import com.geekster.recipeManagementSystem.services.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chef")
public class ChefController {
    @Autowired
    ChefService chefService;
    @PostMapping()
    public void addChef(@RequestBody Chef chef){
        chefService.insertChef(chef);
    }
    @GetMapping()
    public Iterable<Chef> getChef(){
        return chefService.getAllChef();
    }
    @DeleteMapping (value = "/deleteUser/{id}")
    public void deleteChefById(@PathVariable Integer id){
        chefService.removeChefById(id);
    }



}
