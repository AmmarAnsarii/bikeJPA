package com.example.bike;

import jakarta.persistence.*;

@Entity
public class Bike {
	
	@Id
	@GeneratedValue
	int id;
	String name;
	String brand;
	int price;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Bike(int id, String name, String brand, int price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
}
