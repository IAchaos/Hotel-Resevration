package com.example.booking.service;

import com.example.booking.model.Hotel;
import com.example.booking.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    public List<Hotel> getHotelsByLocationAndPrice(String ville, Double prixParNuit) {
        return hotelRepository.findByVilleAndPrixParNuitLessThanEqual(ville, prixParNuit);
    }
}