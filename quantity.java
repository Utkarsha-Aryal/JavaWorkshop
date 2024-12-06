package k;
import java.util.Scanner;
public class quantity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How much you willing to pay: ");
		double pay = input.nextDouble();
		System.out.print("How much you want: ");
		double amount = input.nextDouble();
		double total = amount * pay ;
		System.out.print("The total cost will be: " + total);
	}

}
