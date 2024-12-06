package k;
import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of rectangle: ");
		double l = input.nextDouble();	
		System.out.print("Enter the breadth of rectangle: ");
		double b = input.nextDouble();
		double perimeter = 2*(l+b);
		System.out.print("The perimeter is: "+ perimeter);
}

}
