package com.lab2.assignment1;

import java.util.Scanner;

public class PayMoney {
	Scanner sc2 = new Scanner(System.in);

	public void targetCount(int revenuePerDays[], int noOfTarget) {

		for (int i = 1; i <= noOfTarget; i++) {
			
			System.out.println("Enter the value of target " + i);
			int target = sc2.nextInt();
			int sum =0;
			boolean flag = false;
			
			for (int j = 0; j < revenuePerDays.length; j++) 
			{
				sum += revenuePerDays[j];
				if (sum >= target) {
					System.out.println("Target achieved in " + (j + 1) + " days");
					flag = true;
					break;
				}
			}
			if(!flag)
				System.out.println("Target not achieved");
		}
		sc2.close();
	}
}
