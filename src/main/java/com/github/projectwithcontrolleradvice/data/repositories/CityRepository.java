package com.github.projectwithcontrolleradvice.data.repositories;

import com.github.projectwithcontrolleradvice.data.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
