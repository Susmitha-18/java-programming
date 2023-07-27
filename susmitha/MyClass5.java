package susmitha;
/*find whether the given number is divisible by two or three*/
import java.util.Scanner;
public class MyClass5 {

	public static void main(String[] args) {
		Scanner susmi =new Scanner (System.in);
		System.out.print("enter a numer:  ");
		int input =susmi.nextInt();
		if (input %2==0) {
			System.out.print("\nthe given number is divisible by 2" );}
		else if(input%3==0) {
			System.out.print("\nthe given number is divisible by 3"); }
		else {
			System.out.print("\nthe given number is not divisible by 2 and 3"); }
			
			
		}
	}


