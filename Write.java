package week3;
import java.io.*;
public class Write {
	public static void main(String[] args) {
//		using file writer
		try {
			FileWriter fw = new FileWriter("C:\\Users\\ACER\\Desktop\\ram.txt");
			fw.write("This is file handeling using file writer...");
			System.out.println("Creating a file and write into it");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
	}
}
