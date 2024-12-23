package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bike.Bike;
import com.example.service.BikeService;

@RestController
@RequestMapping("/api/bikes")
public class BikeController {
	
	@Autowired
	BikeService bikeService;
	
	@PostMapping
	public Bike createBike(@RequestBody Bike bike) {
		return bikeService.saveBike(bike);
	}
	
	@GetMapping
	public List<Bike> getAllBikes() {
		return bikeService.getAllBikes();
	}
	
	@GetMapping("/{id}")
	public Bike getBikeById(@PathVariable int id) {
		return bikeService.getBikeById(id);
	}
	
	@PutMapping("/{id}")
	public Bike updateBike(@PathVariable int id,@RequestBody Bike updatedBike) {
		return bikeService.updateBike(id, updatedBike);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBike(@PathVariable int id) {
		bikeService.deleteBike(id);
	}
}
