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
	 * helpful to you. jajajajajajaja
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate. no like ternary operators. I could have used them in deciding what the price would be
	 * example: String stringPrice = answer.equals("four") ? "4" : "0";
	 * int price = Integer.parseInt(stringPrice); 
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both. jajajaja
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price. jajajaja
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out. jajajaja
	 * 
	 * -The program should continue until the user chooses to check out. jajajaja
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back. jajajaja
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
				switch (answer) {
				case "noah":
					System.out.println("How many noahs do you want? price = 4 dollars");
					int noahs = scanner.nextInt();
					total = total + (4 * noahs);
					System.out.println(noahs + " noahs successfully added to cart. Your total is: " + total);
					for (int i = 0; i < noahs; i++) {
						noahCart.add(new Noah());
					}
					break;
				case "armani":
					System.out.println("How many armanis do you want? price = 5 dollars");
					int armanis = scanner.nextInt();
					total = total + (5 * armanis);
					System.out.println(armanis + " armanis successfully added to cart. Your total is " + total);
					for (int i = 0; i < armanis; i++) {
						armaniCart.add(new Armani());
					}
					break;
				case "candy":
					System.out.println("How much candy do you want? price = 1 dollar");
					int candies = scanner.nextInt();
					total = total + candies;
					System.out.println(candies + " candies successfully added to your cart. Your total is " + total);
					for (int i = 0; i < candies; i++) {
						candyCart.add(new Candy());
					}
					break;
				case "cereal":
					System.out.println("How many cereal boxes do you want? price = 10 dollars");
					int boxes = scanner.nextInt();
					total = total + (10 * boxes);
					System.out.println(boxes + " boxes successfully added to your cart. Your total is " + total);
					for (int i = 0; i < boxes; i++) {
						cerealCart.add(new Cereal());
					}
					break;
				case "show cart":
					noahCart.showCart();
					armaniCart.showCart();
					candyCart.showCart();
					cerealCart.showCart();
					break;
				case "remove":
					System.out.println("What do you want to remove?");
					String removedItem = scanner.nextLine();
					switch (removedItem) {
					case "noah": 
						System.out.println("How many noahs would you like to remove?");
						int removeNoahs = scanner.nextInt();
						if (noahCart.length() < removeNoahs) {
							System.out.println("You tried removing more products than there are in your cart.");
						} else {
							total = total - (4 * removeNoahs);
							System.out.println(
									removeNoahs + " noahs successfully removed to your cart. Your total is " + total);
							for (int i = 0; i < removeNoahs; i++) {
								noahCart.remove();
							}
						}
						
						break;
					case "armani": 
						System.out.println("How many armanis would you like to remove?");
						int removeArmanis = scanner.nextInt();
						if (armaniCart.length() < removeArmanis) {
							System.out.println("You tried removing more products than there are in your cart.");
						} else {
							total = total - (5 * removeArmanis);
							System.out.println(
									removeArmanis + " armanis successfully removed to your cart. Your total is " + total);
							for (int i = 0; i < removeArmanis; i++) {
								armaniCart.remove();
							}
						}
						
						break;
					case "candy": 
						System.out.println("How many candies would you like to remove?");
						int removeCandy = scanner.nextInt();
						if (candyCart.length() < removeCandy) {
							System.out.println("You tried removing more products than there are in your cart.");
						} else {
							total = total - (removeCandy);
							System.out.println(
									removeCandy + " candies successfully removed to your cart. Your total is " + total);
							for (int i = 0; i < removeCandy; i++) {
								candyCart.remove();
							}
						}
						
						break;	
						
					case "cereal": 
						System.out.println("How many boxes would you like to remove?");
						int removeBoxes = scanner.nextInt();
						if (cerealCart.length() < removeBoxes) {
							System.out.println("You tried removing more products than there are in your cart.");
						} else {
							total = total - (10 * removeBoxes);
							System.out.println(
									removeBoxes + " boxes successfully removed to your cart. Your total is " + total);
							for (int i = 0; i < removeBoxes; i++) {
								cerealCart.remove();
							}
						}
						
						break;
					
					}

					break;

				default:
					System.out.println("What else would you like today?");

					break;
				}

			} while (!answer.equalsIgnoreCase("check out"));

			System.out.println("Thank you for shopping! Your total is: " + total);
			if (total > budget) {
				System.out.println("Get out of here you don't have enough money to pay");
				System.exit(total); // I mean my code gives the value of the total, so you can see how much you are due, and you can remove items as a result.
				//If I were to integrate this, I would add a boolean called "done" or something, and while it was false, and when checkout was called, 
				//I would just have it Syso the user and ask them to remove stuff. Basically, for done to be true, you would have to check out successfully
				//while the budget is greater than the total. Easy jajajaa
			} else {
				System.out.println("Thank you for shopping with us!");
				int noahCount = noahCart.count();
				int armaniCount = armaniCart.count();
				int candyCount = candyCart.count();
				int cerealCount = cerealCart.count();
				
				System.out.println("Receipt:");
				
				System.out.println(noahCount + " noahs --- " + (4*noahCount));
				System.out.println(armaniCount + " armanis --- " + (5*armaniCount));
				System.out.println(candyCount + " candies --- " + (candyCount));
				System.out.println(cerealCount + " cereal boxes --- " + (10*cerealCount));
				System.out.println("total due: " + total);
				int moneyleft = budget - total;
				System.out.println("Money left = " + moneyleft);
				
				noahCart.showCart();
				armaniCart.showCart();
				candyCart.showCart();
				cerealCart.showCart();
				
				
				System.exit(0);
			}
			// work on adding and removing noahs and stuff. Should be pretty simple, just
			// ask how many noahs the user wants to remove, and then
			// go to their respective classes and lists and do remove. Also make sure to
			// subtract the thing from total
		}
	}

}
