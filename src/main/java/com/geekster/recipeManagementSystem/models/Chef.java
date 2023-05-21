package com.geekster.recipeManagementSystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chefId;
    private String chefName;
}
