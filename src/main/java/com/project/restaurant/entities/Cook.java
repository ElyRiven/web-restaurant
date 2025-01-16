package com.project.restaurant.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coo_code")
    private int idCook;
    @Column(name = "coo_name")
    private String name;
    @Column(name = "coo_lastname")
    private String lastName;
    @Column(name = "coo_specialty")
    private String specialty;
    @Column(name = "coo_description")
    private String comment;
    @Column(name = "coo_imageurl")
    private String imageURL;
}
