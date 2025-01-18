package com.project.restaurant.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_code")
    private int idComment;
    @Column(name = "com_name")
    private String name;
    @Column(name = "com_description")
    private String comment;
    @Column(name = "com_imageurl")
    private String imageURL;
}
