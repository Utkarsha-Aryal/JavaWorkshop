package week3;

import java.io.*;
import java.io.IOException;

public class BufferWriter {
	public static void main(String[] args) {
		try {
//			if do true its called append
			FileWriter fw = new FileWriter("C:\\Users\\ACER\\Desktop\\ram.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This file handling using buffer writer 2");
			System.out.println("This is using buffered");
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
