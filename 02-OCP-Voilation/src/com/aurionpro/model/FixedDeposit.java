package com.aurionpro.model;

public class FixedDeposit {
	int accountNumber;
	String name;
	double principle;
	int duration;
	FestivalType festival;

	public FixedDeposit(int accountNumber,String name, double principle, int duration, FestivalType festival) {
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
		this.accountNumber=accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getDuration() {
		return duration;
	}

	public FestivalType getFestival() {
		return festival;
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	private double getIntrestRates() {
		if (festival == FestivalType.DIWALI) {
			return 8.5;
		} else if (festival == FestivalType.OTHER) {
			return 6.5;
		} else if (festival == FestivalType.HOLI) {
			return 7.5;
		} else if (festival == FestivalType.NEWYEAR) {
			return 8.5;
		} else
			return 2.5;
	}

	public void calculateSimpleIntrest() {
		double ans;
		ans = (getIntrestRates() * duration * principle / 100);
		System.out.println("Simple Interest : " + ans);
	}

	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principle=" + principle
				+ ", duration=" + duration + ", festival=" + festival + "]";
	}
	

}
