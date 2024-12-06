package k;
import java.util.Scanner;
public class ifstatement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of the height: ");
		double h = input.nextDouble();
		System.out.print("Enter the value of the bredth: ");
		double b = input.nextDouble();
		
		if(h==b) {
			System.out.print("It is a square");
		}
		else {
			System.out.print("It is a rectangle");
		}
		
		
	}

}
