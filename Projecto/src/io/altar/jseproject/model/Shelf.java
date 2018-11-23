package io.altar.jseproject.model;

import java.util.Arrays;

public class Shelf extends Entity {
	
	private String capacity;
	private long[] productId;
	private double rentPrice;
	
	


	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public long[] getProductId() {
		return productId;
	}


	public void setProductId(long[] productId) {
		this.productId = productId;
	}


	public double getRentPrice() {
		return rentPrice;
	}


	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}


	public Shelf(String capacity, long[] productId, double rentPrice) {

		this.capacity = capacity;
		this.productId = productId;
		this.rentPrice = rentPrice;
	}


	@Override
	public String toString() {
		return "Shelf "+this.getId()+ "[capacity=" + capacity + ", productId=" + Arrays.toString(productId) + ", rentPrice=" + rentPrice
				+ "]";
	}
	


	




	
	
}
