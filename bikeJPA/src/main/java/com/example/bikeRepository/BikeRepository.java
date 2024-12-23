package com.example.bikeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bike.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{
}
