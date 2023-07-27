package susmitha;
import java.util.Scanner;
public class MyClass2 {

	public static void main(String[] args) {
		// program to get input and print that input
		Scanner susmi=new Scanner(System.in);
		System.out.print("enter your name:" );
		String name= susmi.nextLine();
		System.out.print( "hello " + name );
		String after= susmi.nextLine();
		System.out.print("after seeing this program you will appreciate me or not?");
        String yesno=susmi.next();	
        if(yesno.equals("yes")) {
        System.out.print("thankyou so much!!!!");
        }
        else if(yesno.equals("no")) {
        System.out.print("ok! next time i will make you this more intresting ");
        }
	}

}
