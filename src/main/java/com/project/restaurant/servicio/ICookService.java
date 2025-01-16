package com.project.restaurant.servicio;

import com.project.restaurant.entities.Cook;
import java.util.List;

public interface ICookService {

    public void saveCook(Cook cook);

    public List<Cook> listCook();

    public void deleteCook(int idCook);

    public Cook editCook(int idCook);
}