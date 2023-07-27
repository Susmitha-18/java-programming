package susmitha.s;
/*program to reverse a string*/
import java.util.Scanner;

public class MyClass13 {

	public static void main(String[] args) {
		String revString;
		int s;
		
		Scanner susmi = new Scanner(System.in);
		System.out.println("enter any string : ");
		revString=susmi.nextLine();
		String newString="";
		for(s=revString.length()-1; s>=0;s--) {
	
			newString+=revString.charAt(s);  /*concat*/
		}
		System.out.println("Reversed String: "+newString);
		

	}/*points to remember
	for loop is used to iterate the reverse string in reverse order*/

}
