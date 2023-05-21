package com.geekster.recipeManagementSystem.services;

import com.geekster.recipeManagementSystem.models.Chef;
import com.geekster.recipeManagementSystem.models.Recipie;
import com.geekster.recipeManagementSystem.repositeries.IRecipieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipieService {
    @Autowired
    IRecipieRepo recipieRepo;
    public void insertRecipie(Recipie recipie) {
        recipieRepo.save(recipie);
    }

    public Iterable<Recipie> getAllRecipie() {
        Iterable<Recipie> allRecipie = recipieRepo.findAll();
        return allRecipie;
    }

    public void removeRecipieById(Integer id) {
        recipieRepo.deleteById(id);
    }

}
