package susmitha.s;
/*prime number or not*/
import java.util.Scanner;

public class MyClass8 {

	public static void main(String[] args) {
		int i, count=0,number;
	Scanner susmi =new Scanner (System.in);
	System.out.print("enter a number : ");
		number=susmi.nextInt();
		
		for( i=2; i<=number/2; i++) {
			if(number%i==0) {
				count++;
				break;}}
		if(count==0&&number!=1)
		{				System.out.print(number +" is a prime number");
		}
		else {
			System.out.print(number +" is not a prime number");
		}
}


		
		

	}


	
	