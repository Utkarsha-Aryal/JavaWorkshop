package k;
import java.util.Scanner;
public class ConvertCurrency {
	public static void main(String[] args) {
		System.out.print("What is the conversion rate: ");
		Scanner input = new Scanner(System.in);
		double c = input.nextDouble();
		System.out.print("The money you want to convert: ");
		double a = input.nextDouble();
		System.out.print("The converted amount is : "+a*c);
	}

}
