package io.altar.jseproject.model;

public class Product {
	private int productId;
	private int[] shelvesId;
	private double discountValue;
	private double iva;
	private double pvp;
	
	
	
	public Product(int productId, int[] shelvesId, double discountValue, double iva, double pvp) {
		
		this.productId = productId;
		this.shelvesId = shelvesId;
		this.discountValue = discountValue;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int[] getShelvesId() {
		return shelvesId;
	}
	public void setShelvesId(int[] shelvesId) {
		this.shelvesId = shelvesId;
	}
	public double getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

}