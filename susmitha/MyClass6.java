package susmitha;

import java.util.Scanner;

/*find the largest number among the three numbers*/
public class MyClass6 {
		

	public static void main(String[] args) {
		Scanner susmi =new Scanner (System.in);
		
		System.out.print("enter a value for a : ");
		int input =susmi.nextInt();
		int a=input;
		System.out.print("enter a value for b : ");
		 input =susmi.nextInt();
		int b=input;
		System.out.print("enter a value for c : ");
		input =susmi.nextInt();
		 int c=input;
		
		if(a>=b&&a>=c) {
			System.out.print("the largest number is : "+a);}
		else if(b>=a&&b>=c) {
			System.out.print("the largest number is : "+b);}
		else {
			System.out.print("the largest number is : "+c);}
		}
		

		

	}


