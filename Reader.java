package week3;
import java.io.*;
public class Reader {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\\\Users\\\\ACER\\\\Desktop\\\\ram.txt");
			int i ;
			while((i=fr.read()) !=-1) {
				System.out.print((char)i);
			}
			fr.close();
			
		}catch(IOException e) {
			
		}
		
	}
}
