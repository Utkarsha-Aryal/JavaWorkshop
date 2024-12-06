package week3;
import java.util.Scanner;

class BankAccount{
	private int accountNumber = 12345678;
	private double balance = 500.24;
	Scanner inputB = new Scanner(System.in);
	public void setAccountnumber( int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAccountnumber() {
		return this.accountNumber;
	}

	public double getBalance() {
		return this.balance ;
	}
	
	public void deposite() {
		System.out.println("How much you want to deposite");
		double deposited_Amount = inputB.nextDouble();
		balance = balance + deposited_Amount;
		System.out.println("Your new balance is"+ balance);
	}
	
	public void withdraw() {
		System.out.println("How much you want to withdraw");
		double withdraw_Amount = inputB.nextDouble();
		balance = balance - withdraw_Amount;
		System.out.println("Your new balance is"+ balance);
	}
	
	

	
	
}
public class W3T1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to deposite or withdraw your balance choose D or W: ");
		 char value = input.next().charAt(0); 
		 BankAccount B = new BankAccount();
		 
		 if(value == 'D'|| value == 'W' ) {
			 if(value == 'D') {
				 B.deposite();
				 
			 }else {
				 B.withdraw();
			 }
			 
			 
		 }else {
			 while(value != 'D' || value != 'W') {
				 System.out.println("Please enter again: ");
				  value = input.next().charAt(0);
				  if(value == 'D'|| value == 'W' ) {
						 if(value == 'D') {
							 B.deposite();
							 
						 }else {
							 B.withdraw();
						 }
						 
						 
					 }
				  
				  
				 
			 }
		 }
		
		
		
		System.out.println("Account number is: "+B.getAccountnumber());
		System.out.println("Balance  is: "+B.getBalance());
		

	}
	

}
