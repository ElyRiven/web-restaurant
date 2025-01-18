package com.project.restaurant.servicio;

import com.project.restaurant.entities.Booking;
import java.util.List;

public interface IBookingService {

    public void saveBooking(Booking booking);

    public List<Booking> listBooking();

    public void deleteBooking(int idBooking);

    public Booking editDish(int idBooking);
}