package com.lab2.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of currency denomination ");
		int noOfDenomination = sc.nextInt();
		int currency[] = new int[noOfDenomination];

		System.out.println("Please enter currency denomination value");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
		}

		Arrays.sort(currency);

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		NoteCount nc = new NoteCount();
		nc.counting(currency, amount);

		sc.close();

	}

}
