package io.altar.jseproject.model;

import java.util.Arrays;

public class Shelf extends Entity {
	
	private String capacity;
	private Long productId;
	private double rentPrice;
	
	


	

	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public Long getProduct() {
		return productId;
	}


	public void setProduct(Long productId) {
		this.productId = productId;
	}


	public double getRentPrice() {
		return rentPrice;
	}


	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}


	public Shelf(String capacity, Long productId, double rentPrice) {

		this.capacity = capacity;
		this.productId = productId;
		this.rentPrice = rentPrice;
	}
	public Shelf(String capacity, double rentPrice) {

		this.capacity = capacity;

		this.rentPrice = rentPrice;
	}

	@Override
	public String toString() {
		return "Shelf " +getId() +"[capacity=" + capacity + ", productId=" +productId + ", rentPrice=" + rentPrice + "]";
	}


	
	


	




	
	
}
