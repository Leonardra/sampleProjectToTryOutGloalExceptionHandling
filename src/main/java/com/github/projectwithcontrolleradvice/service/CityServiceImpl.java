package com.github.projectwithcontrolleradvice.service;

import com.github.projectwithcontrolleradvice.data.models.City;
import com.github.projectwithcontrolleradvice.data.repositories.CityRepository;
import com.github.projectwithcontrolleradvice.exceptions.CityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityServiceImpl implements CityService{

    @Autowired
    CityRepository cityRepository;


    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City findCity(Long id) {
        return cityRepository.findById(id).orElseThrow(()-> new CityNotFoundException("City with id not found"));
    }

    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }
}
