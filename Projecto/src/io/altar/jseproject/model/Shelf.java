package io.altar.jseproject.model;

public class Shelf {
	private int shelfId;
	private String capacity;
	private int productId;
	private double rentPrice;
	
	
	public int getShelfId() {
		return shelfId;
	}


	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}


	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public double getRentPrice() {
		return rentPrice;
	}


	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

// Para prateleira vazia
	public Shelf(int shelfId, String capacity, double rentPrice) {
		
		this.shelfId = shelfId;
		this.capacity = capacity;
		this.rentPrice = rentPrice;
	}


	
	
}
