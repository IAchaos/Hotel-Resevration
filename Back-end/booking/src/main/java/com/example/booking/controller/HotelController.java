package com.example.booking.controller;

import com.example.booking.model.Hotel;
import com.example.booking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/search")
    public List<Hotel> getHotelsByLocationAndPrice(@RequestParam String ville, @RequestParam Double prixParNuit) {
        return hotelService.getHotelsByLocationAndPrice(ville, prixParNuit);
    }
}