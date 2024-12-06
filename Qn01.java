package workshop1;

 class Animal {
	 String name ;
	 int age;
	 
	 public Animal(String name, int age) {
//this means the class
		 this.name = name;
		 this.age = age;
		 System.out.println("This is from super class");
		 System.out.println ("The name of dog is "+name +" Which is "+ age);
	 }
	

}
 class Dog extends Animal{
	 String breed;
	 
	 public Dog(String name, int age, String breed) {
		 super(name,age);
		 this.breed = breed;
	 }
	 public String toString() {
		 return ("The name of dog is "+name +" Which is "+ age+"Years of "+breed+"breed");
	 }
 }

 class Qn01{
	 public static void main(String[] args) {
		 Dog myDog = new Dog(" Rohan",19,"Bihari Babu");
		 System.out.println(myDog);
	 }
 }