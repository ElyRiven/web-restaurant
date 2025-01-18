package com.project.restaurant.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boo_code")
    private int idBooking;
    @Column(name = "boo_name")
    private String name;
    @Column(name = "boo_mail")
    private String mail;
    @Column(name = "boo_phone")
    private String phone;
    @Column(name = "boo_datetime")
    private String dateTimeBooking;
    @Column(name = "boo_people")
    private int numberPeople;
    @Column(name = "boo_description")
    private String comment;
}
