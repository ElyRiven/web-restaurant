package com.project.restaurant.repository;

import com.project.restaurant.entities.Cook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface ICookRepository extends JpaRepository<Cook,Integer> {
}
