package com.github.projectwithcontrolleradvice.data.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String cityName;
    private Long populationSize;
}
