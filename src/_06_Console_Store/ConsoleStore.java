package _06_Console_Store;

import java.util.Scanner;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your budget today?");
		int budget = scanner.nextInt();

		System.out.println("Are you ready to shop? ");
		String yesOrNo = scanner.nextLine();

		if (yesOrNo.equalsIgnoreCase("no")) {
			System.out.println("Come again soon!");
			System.exit(0);
		} else {

			System.out.println("Let's get started! Type in what you want to buy. When you are done, type 'check out' ");
			System.out.println(
					"Your options to purchase are: Noah, Armani, Cereal, and Candy. You can have 5 of each at most");
			String answer;
			int total = 0;
			Cart<Noah> noahCart = new Cart<Noah>();
			Cart<Armani> armaniCart = new Cart<Armani>();
			Cart<Cereal> cerealCart = new Cart<Cereal>();
			Cart<Candy> candyCart = new Cart<Candy>();

			do {
				answer = scanner.nextLine();

				if (answer.equalsIgnoreCase("noah")) {
					System.out.println("How many noahs do you want? price = 4 dollars");
					int noahs = scanner.nextInt();
					total = total + (4 * noahs);
					System.out.println(noahs + " noahs successfully added to cart. Your total is: " + total);
					for (int i = 0; i < noahs; i++) {
						noahCart.add(new Noah());
					}

				}
				if (answer.equalsIgnoreCase("armani")) {
					System.out.println("How many armanis do you want? price = 5 dollars");
					int armanis = scanner.nextInt();
					total = total + (5 * armanis);
					System.out.println(armanis + "armanis successfully added to cart. Your total is " + total);
					for (int i = 0; i < armanis; i++) {
						armaniCart.add(new Armani());
					}
				}
				if (answer.equalsIgnoreCase("candy")) {
					System.out.println("How much candy do you want? price = 1 dollar");
					int candies = scanner.nextInt();
					total = total + candies;
					System.out.println(candies + " candies successfully added to your cart. Your total is " + total);
					for (int i = 0; i < candies; i++) {
						candyCart.add(new Candy());
					}
				}
				if (answer.equalsIgnoreCase("cereal")) {
					System.out.println("How many cereal boxes do you want? price = 10 dollars");
					int boxes = scanner.nextInt();
					total = total + (10 * boxes);
					System.out.println(boxes + " boxes successfully added to your cart. Your total is " + total);
					for (int i = 0; i < boxes; i++) {
						cerealCart.add(new Cereal());
					}

				}
				if (answer.equalsIgnoreCase("show cart")) {

					noahCart.showCart();
					armaniCart.showCart();
					candyCart.showCart();
					cerealCart.showCart();

				}
				System.out.println("Would you like to buy anything else?");

			} while (!answer.equalsIgnoreCase("check out"));

			System.out.println("Thank you for shopping! Your total is: " + total);
			if (total > budget) {
				System.out.println("Get out of here you don't have enough money to pay");
				System.exit(total);
			} else {
				System.out.println("Thank you for shopping with us!");
				System.exit(0);
			}
			//work on adding and removing noahs and stuff. Should be pretty simple, just ask how many noahs the user wants to remove, and then 
			//go to their respective classes and lists and do remove. Also make sure to subtract the thing from total
		}
	}

}
