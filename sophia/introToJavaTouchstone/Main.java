import java.awt.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int budget = 0;

		System.out.println("Please enter your starting balance");
		try {
			budget= scanner.nextInt();
			if(budget == 0) {
				System.out.println("Please enter a vaild starting balance");
			}
		} catch (Exception e) {
		    System.out.println("Please enter a number without a decimal");
		}

		boolean balanceCheck = verifyBalance(budget);
		if(!balanceCheck) {
			return;
		}

		do {

			System.out.println("your current balance is " + budget);
			System.out.println("Enter spending amount");

			int spendingAmount = scanner.nextInt();
			if(spendingAmount > budget) {
				System.out.println("You do not have enough money to spend that amount");
				return;
			}

			int newBalance = budget - spendingAmount;

			budget = newBalance;	
		} while (balanceCheck);
	}

	public static boolean verifyBalance(int balance) {
		if(balance == 0 || balance < 0) {
			return false;
		} else {
			return true;
		}

	}

}
