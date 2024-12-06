package week3;

class Encapsulation{
	private String name = "Ankit";
	 private int age = 23;
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 public int getAge() {
		 return this.age;
	 }
	 
}



public class Student {
	public static void main(String[] args) {
		Encapsulation el = new Encapsulation();
		
		System.out.println("Name is: "+el.getName());
		System.out.println("Age is: "+el.getAge());
		
		
	}

}
