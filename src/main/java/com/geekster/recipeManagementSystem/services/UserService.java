package com.geekster.recipeManagementSystem.services;


import com.geekster.recipeManagementSystem.models.Recipie;
import com.geekster.recipeManagementSystem.models.User;
import com.geekster.recipeManagementSystem.repositeries.IUserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

@Autowired
    IUserRepo userRepo;
    public void insertUser(User user) {
        userRepo.save(user);
    }


    public void removeUserById(Integer id) {
        userRepo.deleteById(id);
    }


}
