package com.aurionpro.model;

public class Worker implements IWorker {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Worker started eating");
		
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("Worker started resting");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Worker started working");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Worker stopped working");
		
	}

}
