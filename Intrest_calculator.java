package k;
import java.util.Scanner;
public class Intrest_calculator {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the pincipal amount: ");
		double p  = input.nextDouble();
		System.out.print("Enter the intrest amount: ");
		double r = input.nextDouble();
		System.out.print("Enter the time the money is set: ");
		double t = input.nextDouble();
		double intrest = (p*t*r)/100;
		System.out.println("The simple intrest is: "+ intrest);

		
	}

}
