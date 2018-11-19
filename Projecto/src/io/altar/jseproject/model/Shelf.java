package io.altar.jseproject.model;

public class Shelf extends Entity {
	
	private String capacity;
	private int[] productId;
	private double rentPrice;
	
	


	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public int[] getProductId() {
		return productId;
	}


	public void setProductId(int[] productId) {
		this.productId = productId;
	}


	public double getRentPrice() {
		return rentPrice;
	}


	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

// Para prateleira vazia
	public Shelf( String capacity, double rentPrice) {
		
	
		this.capacity = capacity;
		this.rentPrice = rentPrice;
	}


	
	
}
