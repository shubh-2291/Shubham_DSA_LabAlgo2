package com.lab2.assignment1;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of days");
		int noOfdays = sc.nextInt();

		int revenuePerDays[] = new int[noOfdays];

		for (int i = 0; i < revenuePerDays.length; i++) {
			System.out.println("Please enter revenue for day " + (i + 1));
			revenuePerDays[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTarget = sc.nextInt();

		PayMoney paymoney = new PayMoney();
		paymoney.targetCount(revenuePerDays, noOfTarget);

		sc.close();
	}

}
