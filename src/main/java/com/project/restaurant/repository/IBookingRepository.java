package com.project.restaurant.repository;

import com.project.restaurant.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface IBookingRepository extends JpaRepository<Booking,Integer> {
}
