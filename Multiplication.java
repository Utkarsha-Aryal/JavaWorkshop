package k;
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		double z;
		System.out.print("Which numbers table do you want to display: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		int i = 0;
		while(i<10) {
			i = i +1;
			z= i*x;
			System.out.println(x+"*"+i+"="+z);
		}
	}

}
