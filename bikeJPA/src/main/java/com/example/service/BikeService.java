package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bike.Bike;
import com.example.bikeRepository.BikeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BikeService {
	
	@Autowired
	BikeRepository bikeRepo;
	
	//Logic for saving a bike in the database
	public Bike saveBike(Bike bike) {
		return bikeRepo.save(bike);
	}
	
	//Logic for returning all the bikes saved in the DB
	public List<Bike> getAllBikes(){
		return bikeRepo.findAll();
	}
	
	//Logic for retrieving only the bike with the given ID
	public Bike getBikeById(int id) {
		return bikeRepo.findById(id).orElseThrow(() -> new RuntimeException("Bike not found"));
	}
	//Logic for updating a bike
	public Bike updateBike(int id, Bike updatedBike) {
		Bike bike = getBikeById(id);
		bike.setName(updatedBike.getName());
		bike.setBrand(updatedBike.getBrand());
		bike.setPrice(updatedBike.getPrice());
		return bikeRepo.save(bike);
	}
	
	public void deleteBike(int id) {
		bikeRepo.deleteById(id);
	}
}

