package k;
import java.util.Scanner;
public class Converter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the degree in celcius: ");
		double c = input.nextInt();
		double f = c * 9/5 +32 ;
		
		System.out.println("The converted value in farhenheit is: "+ f);
	}

}
