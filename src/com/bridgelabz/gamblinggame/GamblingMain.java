package com.bridgelabz.gamblinggame;

public class GamblingMain {
	int amount = 100; // Amount gambler starts off with
	final int BETTING_AMOUNT = 1; // The betting amount is always fixed to 1
	final int BETTING_RANGE_WIN = 150; // The upper limit of the amount
	final double BETTING_RANGE_LOSE = 50; // The lower limit of the amount
    int winnings = 0;
	
	//The gamble function allows the user to win
	public void round() {
		int win = (int)(Math.random() * 2); // We are setting a gamble variable that is randomly set to 0 or 1
		
		// If win is equal to 1 it means he has won the gamble
		if (win == 1) {
			amount += BETTING_AMOUNT;
//			System.out.println(" Player won this round");
		}
		// If win is equal to 0 it means he has lost the gamble
		else {
			amount -= BETTING_AMOUNT;
//			System.out.println(" Player lost this round");
		}
		
	}
	
	public void gamble() {
		
		// Gambler stops if the amount is increased or decreased by 50%
		while (amount > BETTING_RANGE_LOSE && amount < BETTING_RANGE_WIN) {
			round();
		}
		
		if(amount == 150) {
			winnings += 50;
		}
		else {
			winnings -= 50;
		}
	}
	
	public void gambleFor20() {
		
		for (int days = 0; days < 20; days++) {
			gamble();
			if (winnings >= 0) 
				System.out.println(" The gambler has won " + winnings + " so far");
			else
				System.out.println(" The gambler has lost " + (-winnings) + " so far");
			amount = 100;
		}
	}
	public static void main(String[] args) {
		GamblingMain g = new GamblingMain();
		g.gambleFor20();
	}
}
