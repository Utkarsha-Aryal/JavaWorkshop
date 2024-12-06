package tutorial2;

class nimal{
	String name = "Ranbir Kapoor";
}

class Dog extends nimal {
	String name = "Bobby Deol";
	public void display() {
		System.out.println("Name is : "+ name);
		System.out.println("Name is : "+ super.name);
	}
}

public class Super {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.display();
	}

}
