package com.lab2.assignment2;

public class NoteCount {

	public void counting(int[] currency, int amount) {

		int notes[] = new int[currency.length];

		int sum = 0;
		for (int i = notes.length - 1; i >= 0; i--) {
			notes[i] = amount / currency[i];
			amount %= currency[i];
			sum += notes[i];
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = notes.length - 1; i >= 0; i--) {
			if (notes[i] != 0)
				System.out.println(currency[i] + " x " + notes[i]);
		}
		System.out.println("Total number of notes " + sum);
	}

}
