package tutorial2;
// if final goat becomes khasi 
// in method final you cant override 
class Janwar{
	String name = "Ranbir Kapoor";
	
	public void display() {
		System.out.println("Parent class name is "+ name);
	}
}
class kukur extends Janwar{
	String name = "Bobby Deol";
	@Override
	public void display() {
		super.display();
		System.out.println("Name is: "+ name);
		System.out.println("Name is: "+ super.name);

	}
}
public class Superclass {
	public static void main(String[] args) {
		kukur k1 = new kukur();
		k1.display();
	}

}
