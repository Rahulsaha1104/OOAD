package com.aurionpro.model;



public class Labour implements IWorker {

	@Override
	public void StartWork() {
		System.out.println("Manager starts Working");

	}

	@Override
	public void StopWork() {
		System.out.println("Manager stops Working");


	}

	@Override
	public void StartEat() {
		System.out.println("Manager starts Eating");


	}

	@Override
	public void StopEat() {
		System.out.println("Manager stops Eating");


	}

}

