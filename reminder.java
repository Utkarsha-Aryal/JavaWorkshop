package k;
import java.util.Scanner;
public class reminder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Write the 1st number");
		double n1 = input.nextDouble();
		System.out.print("Write the 2nd number");
		double n2 = input.nextDouble();
		double d = n1%n2;
		System.out.println(d);
		input.close();
		
	}

}
