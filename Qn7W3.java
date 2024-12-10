package week3;
import java.io.*;
import java.util.Scanner;
/*Write a program to take the name of foods as 
 inputs from the user and store them in a .txt file.*/
public class Qn7W3 {
	public static void main(String[] args) {
		try {
		Scanner input = new Scanner(System.in);
		String food = "" ;
		FileWriter fw =  new FileWriter("C:\\Users\\ACER\\Desktop\\food.txt",true);
		while( !food.equals( "N")) {
			 System.out.println("Enter the food list");
			 food = input.nextLine();
			 fw.write(food + "\n");
		
		}
		fw.close();
		input.close();
		
	}catch(IOException e) {
		e.printStackTrace();
	}

}
}
