package susmitha.s;

import java.util.Scanner;
public class MyClass7 {
/*to find the factors of the given number*/
	public static void main(String[] args) 
	{
		int number;
	System.out.print("enter a number : ");
		Scanner susmi =new Scanner (System.in);
		number=susmi.nextInt();
		System.out.print("factors of "+number+": ");
		int i;
		for( i=1; i<=number; i++) {
			if(number%i==0) {
				System.out.print(i);
		}
		}
}
}
