import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// initial start 
		Scanner scanner = new Scanner(System.in);
		int budget = 0;
		// debug variable to print out debug statements
		boolean debug = false;
		// boolean debug = true;

		System.out.println("Please enter your starting balance");
		// getting the starting balance
		try {
			budget= scanner.nextInt();
			if(budget == 0) {
				System.out.println("Please enter a vaild starting balance");
			}
		} catch (Exception e) {
			// checking for non int values and failing them
		    System.out.println("Please enter a number without a decimal");
		}

		// function to check if the balance is valid
		boolean balanceCheck = verifyBalance(budget);
		if(!balanceCheck) {
			// if the balance is not valid then we exit the program
			return;
		}

		// if the balance is valid then we continue
		// we create a do while loop to keep the program running
		// until the user enters 0 or a negative number
		// we also check if the user has enough money to spend
		// if they do not then we exit the program
		do {

			System.out.println("your current balance is " + budget);
			System.out.println("Enter spending amount");

			int spendingAmount = 0;
			// getting the spending amount
			try {
				spendingAmount = scanner.nextInt();
			} catch (Exception e) {
				// checking for non int values and failing them
				// if the user enters a non int value then we exit the program
			    System.out.println("Please enter a number without a decimal");
				scanner.close();
				return;
			}


			// calculating the new balance
			// Current balance - spending amount
			int newBalance = budget - spendingAmount;

			// reassigning budget to the new balance
			// so that we can use it in the next iteration
			// of the do while loop
			budget = newBalance;
			balanceCheck = verifyBalance(budget);
			if(debug) {
				System.out.println("debug balanceCheck after calculations: " + balanceCheck);
			}

			// checking if the user has enough money to spend
			if(budget == 0) {
				System.out.println("You have no money left");
				if(debug){
					System.out.println("debug balanceCheck inside budget if statment: " + balanceCheck);
				}
				scanner.close();
				balanceCheck = false;
			}

		} while (balanceCheck);
	}

	// function to check if the balance is valid
	public static boolean verifyBalance(int balance) {
		if(balance == 0 || balance < 0) {
			return false;
		} else {
			return true;
		}

	}
}
