package com.project.restaurant.servicio.impl;

import com.project.restaurant.entities.Booking;
import com.project.restaurant.repository.IBookingRepository;
import com.project.restaurant.servicio.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class BookingServiceImpl implements IBookingService {

    @Autowired
    public IBookingRepository bookingRepository;

    @Override
    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public List<Booking> listBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking editDish(int idBooking) {
        return bookingRepository.findById(idBooking).get();
    }

    @Override
    public void deleteBooking(int idBooking) {
        bookingRepository.delete(editDish(idBooking));
    }
}
