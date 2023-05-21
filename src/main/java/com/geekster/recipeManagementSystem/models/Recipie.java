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
public class Recipie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recipieId;
    private String  Name;
    private String Specialization;
    @ManyToOne(cascade = CascadeType.ALL)
    private Chef chef;


}
