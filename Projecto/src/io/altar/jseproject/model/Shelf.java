package io.altar.jseproject.model;

import java.util.Arrays;

public class Shelf extends Entity {
	
	private String capacity;
	private Product product;
	private double rentPrice;
	
	


	

	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public double getRentPrice() {
		return rentPrice;
	}


	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}


	public Shelf(String capacity, Product product, double rentPrice) {

		this.capacity = capacity;
		this.product = product;
		this.rentPrice = rentPrice;
	}
	public Shelf(String capacity, double rentPrice) {

		this.capacity = capacity;

		this.rentPrice = rentPrice;
	}

	@Override
	public String toString() {
		return "Shelf " +getId() +"[capacity=" + capacity + ", " +product + ", rentPrice=" + rentPrice + "]";
	}


	
	


	




	
	
}
