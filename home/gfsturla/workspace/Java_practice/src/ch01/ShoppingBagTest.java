package ch01;

import java.util.Scanner;

public class ShoppingBagTest {
	public static void main(String[] args){
		int numItems;
		float totalCost;
		float taxRate;
		float cost;
		int add;
		boolean ask = true;
		String answer;
		
		Scanner conIn = new Scanner(System.in);
		
		System.out.println("Enter number of items in shopping bag.");
		numItems = conIn.nextInt();
		
		System.out.println("Enter total price fo bag.");
		totalCost = conIn.nextFloat();
		
		System.out.println("Enter tax rate.");
		taxRate = conIn.nextFloat();
		
		ShoppingBag sb1 = new ShoppingBag(numItems, totalCost, taxRate);
		
		
		while(ask){
		System.out.println("Would you like to add items? (Yes or No) ");
			answer = conIn.next();
			if(answer.equals("Yes")){
				ask = true;
				System.out.println("How many items would you like to add?");
				add = conIn.nextInt();
				System.out.println("How much do these items cost?");
				cost = conIn.nextFloat();
				sb1.place(add, cost);
			}
			else{
				ask = false;
			}
		}
		
		String summary = sb1.toString();
		System.out.println(summary);
	}

}
