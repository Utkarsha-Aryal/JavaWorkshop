package week3;

import java.io.*;
import java.util.*;

class Apprentice{
	int id;
	String name;
	int age;
	String grade;
//	constructor to initialize apprentice data
	public Apprentice(int id,String name,int age,String grade) {
		this.id =  id;
		this.name = name;
	    this.age = age;
	    this.grade = grade;
	}
	
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
	
}
public class Qn9W3 {
    public static void main(String[] args) {
//    	Find out what this line does
    	List<Apprentice> apprentices = new ArrayList<>();
    	
    	try {
    		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ACER\\Desktop\\student.csv"));
            String line;
            br.readLine();
            
            while((line = br.readLine())!=null) {
            	String[] data = line.split(",");  //Split the csv line by comma
            	
            	if(data.length == 4) {
            	    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    String grade = data[3].trim();
                    
                	apprentices.add(new Apprentice(id,name,age,grade));

            		
            	}
            }
            br.close();
            apprentices.sort(Comparator.comparing(apprentice -> apprentice.grade));
            
            System.out.println("Apprentices sorted by their grade:");
            for (Apprentice apprentice : apprentices) {
                System.out.println(apprentice);
            }


            

    	}catch(IOException e){
    		 System.out.println("An error occurred while reading the file.");
             e.printStackTrace();
    		
    	}
     
    }
}
