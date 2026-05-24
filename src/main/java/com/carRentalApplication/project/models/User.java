package com.carRentalApplication.project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String role;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    @JsonIgnore
    private String password;


}
