package week3;

interface RemoteControl{
	void powerOn();
	void powerOff();
	
}


class Tv implements RemoteControl{
	public  void powerOn() {
		System.out.println("The tv is turned on");
		
	}
	public  void powerOff() {
		System.out.println("The tv is turned off");
	}
	
}


class Ac implements RemoteControl{
	public  void powerOn() {
		System.out.println("The AC is turned on");
		
	}
	public  void powerOff() {
		System.out.println("The AC is turned off");
	}
	
	
}

public class Qn6W3 {
	public static void main(String[] args) {
		RemoteControl T = new Tv(); 
		RemoteControl A = new Ac();
		T.powerOn();
		T.powerOff();
		
		A.powerOn();
		A.powerOff();
		
	}

}
