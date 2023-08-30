package com.aurionpro.test;
import com.aurionpro.model.*;
public class FestivalTest {
	public static void main(String[] args) {
		FixedDeposit fix = new FixedDeposit(1,"rahul", 10000, 2, FestivalType.DIWALI);
		FixedDeposit fix1 = new FixedDeposit(2,"rahul", 10000, 2, FestivalType.OTHER);
		FixedDeposit fix2 = new FixedDeposit(3,"rahul", 10000, 1, FestivalType.HOLI);
		FixedDeposit fix3 = new FixedDeposit(4,"rahul", 10000, 2, FestivalType.NEWYEAR);
		fix.calculateSimpleIntrest();
		fix1.calculateSimpleIntrest();
		fix2.calculateSimpleIntrest();
		fix3.calculateSimpleIntrest();
	}

}
