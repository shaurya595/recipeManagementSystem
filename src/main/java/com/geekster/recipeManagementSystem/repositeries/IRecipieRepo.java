package com.geekster.recipeManagementSystem.repositeries;

import com.geekster.recipeManagementSystem.models.Chef;
import com.geekster.recipeManagementSystem.models.Recipie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRecipieRepo extends JpaRepository<Recipie,Integer> {

}
