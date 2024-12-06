package k;
import java.util.Scanner;
public class Circle {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		double r = input.nextDouble();
		double a = Math.PI * r*r;
		System.out.print("The area of the circle is: "+ a);
	}

}
