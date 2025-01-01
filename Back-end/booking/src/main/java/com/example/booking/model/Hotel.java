package com.example.booking.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "ville", nullable = false)
    private String ville;

    @Column(name = "description")
    private String description;

    @Column(name = "prix_par_nuit", nullable = false)
    private Double prixParNuit;

    @Column(name = "tot_chambres", nullable = false)
    private Integer totChambres;

    @Column(name = "res_chambres", nullable = false)
    private Integer resChambres;
}