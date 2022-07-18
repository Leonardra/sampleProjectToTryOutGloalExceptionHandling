package com.github.projectwithcontrolleradvice.web.controller;


import com.github.projectwithcontrolleradvice.data.models.City;
import com.github.projectwithcontrolleradvice.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1")
public class CityController {


    @Autowired
    CityService cityService;



    @PostMapping(value = "/", consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<City> saveCity(@RequestBody City city){
        return new ResponseEntity<City>(cityService.saveCity(city), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<City> findCity(@PathVariable Long id){
        return new ResponseEntity<>(cityService.findCity(id), HttpStatus.FOUND);
    }
}
