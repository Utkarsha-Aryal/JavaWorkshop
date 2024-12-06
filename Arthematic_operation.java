package k;
import java.util.Scanner;
public class Arthematic_operation {
	public static void main(String[] args) {
		System.out.print("Enter the value of num1: ");
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		System.out.print("Enter the value of num2: ");
		double num2 = input.nextDouble();
		double sum = num1+num2;
		double sub = num1-num2;
		double multiply = num1*num2;
		double division = num1/num2;
		
		System.out.println("The sum subtration and multiplication of the two numbers "+ num1 + "and"+ num2 +" is "+sum+"  "+sub +"  "+ multiply+ "  "+division );
		
	}

}
