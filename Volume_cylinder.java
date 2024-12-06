package k;
import java.util.Scanner;
public class Volume_cylinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The radius of the cylinder is: ");
		double r = input.nextDouble();
		System.out.println("The height of cylinder is: ");
		double h = input.nextDouble();
		double volume = Math.PI * r*r*h;
		System.out.print("The area of the cylinder is: "+volume);
	}

}
