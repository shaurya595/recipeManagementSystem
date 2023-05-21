package com.geekster.recipeManagementSystem.repositeries;

import com.geekster.recipeManagementSystem.models.Chef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChefRepo extends JpaRepository<Chef,Integer> {
}
