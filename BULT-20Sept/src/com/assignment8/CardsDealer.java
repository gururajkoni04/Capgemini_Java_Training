package com.assignment8;


public class CardsDealer {
	public static void main(String[] args)
	{
		String[] SUITS = {
				"c", "d", "h", "s"
		};



		String[] RANKS = {
				"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K", "A"
		};



		// initialize deck
		int n = SUITS.length * RANKS.length;
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length*i + j] = RANKS[i] + SUITS[j];
			}
		}



		// shuffle
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n-i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		// print shuffled deck
		for (int i = 0; i < 4; i++) {
			System.out.print(" Person " + "#"+(i + 1)+":");
			for (int j = 0; j < 13; j++) {
				System.out.print(deck[i + j * 4] +" ");
			}
			System.out.println();
		}
	}
}