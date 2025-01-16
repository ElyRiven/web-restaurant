package com.project.restaurant.servicio;

import com.project.restaurant.entities.Dish;
import java.util.List;

public interface IDishService {

    public void saveDish(Dish dish);

    public List<Dish> listDish();

    public void deleteDish(int idDish);

    public Dish editDish(int idDish);
}