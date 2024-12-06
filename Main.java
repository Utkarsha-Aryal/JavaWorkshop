package k;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write the length of side a: ");
		int a = scanner.nextInt();
		System.out.println("Write the length of side b ");
		int b= scanner.nextInt();
		System.out.println("Write the length of side c");
		int c= scanner.nextInt(); 
		
		int s = (a+b+c)/2 ;
		
		int sq = s*(s-a)*(s-b)*(s-c);
		double area = Math.sqrt(sq);
		System.out.print("The area of the triangle with the sides "+a+" "+b+" "+c+" "+"is"+ area );
		
	}

} 
