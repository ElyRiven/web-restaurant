package com.project.restaurant.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dis_code")
    private int idDish;
    @Column(name = "dis_name")
    private String name;
    @Column(name = "dis_description")
    private String description;
    @Column(name = "dis_imageurl")
    private String imageURL;
    @Column(name = "dis_price")
    private double price;
}
