package com.geekster.recipeManagementSystem.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(nullable = false)
    @NotEmpty
    private String userName;


    @Column(nullable = false)
    @NotEmpty
    private String password;


    @Column(unique = true , nullable = false)
    @Email
    @NotBlank
    private String email;

    @Column(nullable = false)
    @Pattern(regexp = "\\d{2}-\\d{10}", message = "Phone number should be in the format XX-XXXXXXXXXX")
    private String phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    private Recipie recipie;

}