package com.project.restaurant.servicio.impl;

import com.project.restaurant.entities.Cook;
import com.project.restaurant.repository.ICookRepository;
import com.project.restaurant.servicio.ICookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CookServiceImpl implements ICookService {

    @Autowired
    public ICookRepository cookRepository;

    @Override
    public void saveCook(Cook cook) {
        cookRepository.save(cook);
    }

    @Override
    public List<Cook> listCook() {
        return cookRepository.findAll();

    }

    @Override
    public Cook editCook(int idCook) {
        return cookRepository.findById(idCook).get();
    }

    @Override
    public void deleteCook(int idCook) {
        cookRepository.delete(editCook(idCook));
    }
}
