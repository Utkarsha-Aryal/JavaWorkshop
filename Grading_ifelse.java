package k;
import java.util.Scanner;
public class Grading_ifelse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double percentage ;
		System.out.print("What marks is obtained: ");
		percentage = input.nextDouble();
		
		if(percentage >=40 && percentage <=50 ) {
			System.out.print("The grade obtained is C");
		}
		else if(percentage >50 && percentage <=60){
			System.out.print("The grade obtained is C+");		
		}
		else if(percentage >60 && percentage <=70){
			System.out.print("The grade obtained is B");		
		}
		else if(percentage >70 && percentage <=80){
			System.out.print("The grade obtained is B+");		
		}
		else if(percentage >80 && percentage <=90){
			System.out.print("The grade obtained is A");		
		}
		else if(percentage >90 ){
			System.out.print("The grade obtained is A +");		
		}
		else {
			System.out.print("Failed");
		}
	}

}
