package tutorial2;

class Beast{
	String name = "Ranbir Kapoor";
	int a = 10;
	
	public Beast() {
		System.out.println("Parent class default constructor");
	}
	
}
class Bigfoot extends Beast{
	String name = "Bobby Deol";
	public Bigfoot() {
		System.out.println("Child case no-arg constructor");
	}
}
public class Super2 {
	public static void main(String[] args) {
		Bigfoot b1 = new Bigfoot();
	}

}
   