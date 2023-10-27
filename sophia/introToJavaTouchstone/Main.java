import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


// for the class 

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int budget = 0;

		displayMessage("Please enter your starting balance");
		try {
			budget= scanner.nextInt();
			if(budget == 0) {
				displayMessage("Please enter a vaild starting balance");
			}
		} catch (Exception e) {
		    System.out.println("Please enter a number without a decimal");
		}

		boolean balanceCheck = verifyBalance(budget);
		if(!balanceCheck) {
			return;
		}

		System.out.println("your current balance is " + budget);
		
		displayMessage("Enter spending amount");

		int spendingAmount = scanner.nextInt();
		if(spendingAmount > budget) {
			displayMessage("You do not have enough money to spend that amount");
			return;
		}

		int newBalance = budget - spendingAmount;
		System.out.println("Your new balance is " + newBalance);
	}
	static void displayMessage(String message) {
		System.out.println(message);
	}

	public static boolean verifyBalance(int balance) {
		if(balance == 0 || balance < 0) {
			return false;
		} else {
			return true;
		}

	}

}
