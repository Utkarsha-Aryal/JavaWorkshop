package workshop1;


  class Person{
	  protected String address;
	
}

  class Employee extends Person{
	  String Department;
	  public String toString() {
		  return ("Thee person lives in  "+ address+"is from "+Department+"department");
	  }
  }
public class Qn4 {
	public static void main(String[] args){
		Employee myobj = new Employee();
		myobj.Department = "Jhola gang";
		myobj.address = "Dipa ko side ko ghar";
		System.out.println(myobj.toString());
		
	}
	

}
