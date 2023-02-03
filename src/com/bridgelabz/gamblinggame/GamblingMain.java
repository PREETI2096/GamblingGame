package com.bridgelabz.gamblinggame;

public class GamblingMain {
	public static void main(String[] args) {
		int amount = 100;
		final int BETTING_AMOUNT = 1;

		System.out.println(" Welcome to the Gambler simulator");

		int win = (int) (Math.random() * 2);

		if (win == 1) {
			amount += BETTING_AMOUNT;
		} else
	
			amount -= BETTING_AMOUNT;
		
		System.out.println("after betting :"+amount);
	}
	
}
