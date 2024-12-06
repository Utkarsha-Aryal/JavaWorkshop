package k;
import java.util.Scanner;
public class min_max {
	public static void main(String[] agrs) {
		double x ;
		double y;
		double z;
		Scanner input = new Scanner(System.in);
		System.out.print("Write the side of the base: ");
		x = input.nextDouble();
		System.out.print("Write the side of the height: ");
		y = input.nextDouble();
		z = Math.sqrt((x*x)+(y*y));
		System.out.print("This is the value of the hypotenuse: "+ z);
		
		
		
		
		
		
	}

	
}
