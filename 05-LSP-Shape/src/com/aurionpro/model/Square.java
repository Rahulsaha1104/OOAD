package com.aurionpro.model;

public class Square extends Rectangle {
//	private double side;
	public Square(int side) {
		super(side, side);
		
	}

	@Override
	public void setHeight(int height) {	
		super.setHeight(height);
		super.setWidth(height);
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setWidth(width);
	}

	
	

}
