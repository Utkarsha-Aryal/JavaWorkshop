package workshop1;


class Parent{
	private int age ;
	protected String name;
	public String address;
	
	public int getage() {
		return age;
	}
	
	public void setAge(int newage) {
		this.age = newage;
	}
	
}

class Child extends Parent{
	
	public String toString(){
		return ("The name of parent is " + name+ " the age of the parent "+ getage() + " and lives " +address );
	}
}
public class Qn5 {
	public static void main(String[] args) {
		Child P = new Child();
		P.setAge(18) ;
		P.name = "Ram";
		P.address = "Kathmandu";
		System.out.println(P.toString());
		
	}

}
