package com.project.restaurant.servicio.impl;

import com.project.restaurant.entities.Dish;
import com.project.restaurant.repository.IDishRepository;
import com.project.restaurant.servicio.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class DishServiceImpl implements IDishService {

    @Autowired
    public IDishRepository dishRepository;

    @Override
    public void saveDish(Dish dish) {
        dishRepository.save(dish);
    }

    @Override
    public List<Dish> listDish() {
        return dishRepository.findAll();
    }

    @Override
    public Dish editDish(int idDish) {
        return dishRepository.findById(idDish).get();
    }

    @Override
    public void deleteDish(int idDish) {
        dishRepository.delete(editDish(idDish));
    }
}
