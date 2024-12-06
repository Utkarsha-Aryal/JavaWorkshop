package tutorial2;

 class Person {
	 String name = "Ram Thapa";
	 int age = 29;
}
 class Employee extends Person{
	 double eid = 1;
 }
 
 class Post extends Employee{
	 String role = "Manager";
 }

 public class Inheritance {
	 public static void main(String[] args) {
		 Employee e1 = new Employee();
		 System.out.println("Employee name is: "+ e1.name);
		 System.out.println("Employee age is : "+ e1.age);
		 System.out.println("Employee id is: "+ e1.eid);
		 }
	 }
 