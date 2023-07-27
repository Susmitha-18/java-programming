package susmitha.s;
/*to find the grade of a student*/
import java.util.Scanner;

public class MyClass11 {

	public static void main(String[] args) {
    
	Scanner susmi=new Scanner(System.in);
	System.out.print("enter your mark: " );
	int  mark = susmi.nextInt();
	if(mark>=80 && mark<=100) {
		System.out.print("Grade : A");
	}
	else if(mark>=65 && mark<=79) {
		System.out.print("Grade : B");
	}
	 else if(mark>=50 && mark<=64) {
		 System.out.print("Grade : C");
	 }
	 else {
		 System.out.print(" Fail ");
	 }
	}
		

	}


