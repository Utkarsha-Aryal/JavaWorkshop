package week3;
import java.io.*;
public class BufferReader {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\\\Users\\\\ACER\\\\Desktop\\\\ram.txt");
			BufferedReader br = new BufferedReader(fr);
			String line; 
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
			fr.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
