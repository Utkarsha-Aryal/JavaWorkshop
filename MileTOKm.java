package k;
import java.util.Scanner;
public class MileTOKm {
	public static void main(String[] args) {
		System.out.print("Enter the distance in mile: ");
		Scanner input = new Scanner(System.in);
		double mile = input.nextDouble();
		double km = 1.6*mile;
		System.out.print("The distance in km is: "+ km);
	}

}
