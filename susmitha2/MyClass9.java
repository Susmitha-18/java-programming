package susmitha.s;
import java.util.Scanner;
/*the sum of series*/
public class MyClass9 {
public static void main(String[] args) {
	Scanner susmi=new Scanner(System.in);
	int number, sum=0;
	System.out.print("enter a number : ");
	number=susmi.nextInt();
	for(int i=1; i<=number; i++) {
		sum=sum+i;
	}
	System.out.print("the sum= " +sum);
	
		

	}

}
