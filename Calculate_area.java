package k;
import java.util.Scanner;

public class Calculate_area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the square: ");
		double l = input.nextInt();
		double area = l*l;
		System.out.println(area);

	}

}
