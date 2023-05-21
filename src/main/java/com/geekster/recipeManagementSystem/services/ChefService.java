package com.geekster.recipeManagementSystem.services;

import com.geekster.recipeManagementSystem.models.Chef;
import com.geekster.recipeManagementSystem.repositeries.IChefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChefService {
    @Autowired
    IChefRepo chefRepo;
    public void insertChef(Chef chef) {
        chefRepo.save(chef);
    }

    public Iterable<Chef> getAllChef() {
        Iterable<Chef> allChef = chefRepo.findAll();
        return allChef;
    }

    public void removeChefById(Integer id) {
        chefRepo.deleteById(id);
    }
}
