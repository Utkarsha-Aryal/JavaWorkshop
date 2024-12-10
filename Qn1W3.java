package week3;

public class Qn1W3 {
	public static void main(String[] args) {
		
		Student2 s = new Student2();
		s.setID(2);
		System.out.println("The name of the student is "+s.getName()+" and his id is "+s.getID());
		
	}
	
	

}
 class Student2{
	 private int id ;	 
	 private String name = "Ram";
	 private int age = 12;
	 private char grade = 'A';
	 
	 public void setID(int id) {
//		 this.id = 2;
		 this.id = id;
	 }
	 
	 public int getID() {
		 return this.id;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getName() {
		 return this.name;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
	 public int getAge() {
		 return this.age;
	 }
	 
	 public void setGrade(char grade) {
		 this.grade = grade;
		 
	 }
	 public char getGrade() {
		 return this.grade;
	 }
	 
 }