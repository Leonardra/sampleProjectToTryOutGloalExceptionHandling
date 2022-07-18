package com.github.projectwithcontrolleradvice.service;


import com.github.projectwithcontrolleradvice.data.models.City;
import org.springframework.stereotype.Service;

@Service
public interface CityService {
    City saveCity(City city);
    City findCity(Long id);
    void deleteCity(Long id);
}
