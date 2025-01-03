package com.example.booking.repository;

import com.example.booking.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByVilleAndPrixParNuitLessThanEqual(String ville, Double prixParNuit);
}