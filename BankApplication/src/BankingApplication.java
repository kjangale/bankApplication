import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount("Kunal Jangale", "SBI009");
		obj.showMenu();
	}
	
}
 
class BankAccount {
	float balance;
	float previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cName, String cid) {
	customerName = cName;
	customerId = cid;
	}
	
	void deposit(float amount) {
		if (amount > 0) {
			balance = balance + amount;
			previousTransaction = +amount;
		}
	}
	
	void withdraw(float amount) {
		if (amount > balance) {
			System.out.println("Insufficient Balance...!");
		}
		else {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getpreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited " + previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdrawn: " + previousTransaction);
		}
		else {
			System.out.println("No transaction executed");
		}
	}
	
	public void checkbalance() {
		System.out.println("Balance: " + balance);
		System.out.println("\n");
	}
	
	void showMenu() {
		char option = '\0';
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your id is " + customerId);
		System.out.println("\n");
		
		while (true) {
			System.out.println("A: Check your balance");
			System.out.println("B: Deposit an amount");
			System.out.println("C: Withdraw an amount");
			System.out.println("D: Check previous transaction");
			System.out.println("E: Exit the system");
			System.out.println("+++++++++++++++++++++++++++++++++++++++");
			System.out.println("Enter an option");
			option = s.next().charAt(0);
			System.out.println("\n");
			
			switch (option) {
			case 'A':
				checkbalance();
				break;
				
			case 'B':
				System.out.println("Enter an amount to deposit: ");
				float amount = s.nextFloat();
				deposit(amount);
				System.out.println("\n");
				break;
			
			case 'C':
				System.out.println("Enter an amount to withdraw: ");
				float amount2 = s.nextFloat();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				getpreviousTransaction();
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("++++++++++++++++++++++++++++++++++++");
				break;
				
			default:
				System.out.println("Kindly enter the correct option!!");
				break;
			
			}
		}
		
	}
	
}