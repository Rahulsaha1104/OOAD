package com.aurionpro.model;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitraSpec spec;

	public Guitar(String serialNumber, double price, GuitraSpec spec) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public GuitraSpec getSpec() {
		return spec;
	}
	public void setSpec(GuitraSpec spec) {
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "Guitar [serialNumber=" + serialNumber + ", price=" + price + ", spec=" + spec + "]";
	}

	
	
}

