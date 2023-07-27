package susmitha.s;
/*to print the vowels in the given string */
import java.util.Scanner;
public class MyClass12 {
/* ptr : *for loop is used to iterate string
 *we can also use(str=str.toLowerCase)*/
	public static void main(String[] args) {
		String str=null;
		Scanner susmi = new Scanner(System.in);
		System.out.print("enter any string : ");
		str=susmi.nextLine();

  System.out.print("the vowels in this string are : ");
  for(int s=0; s<str.length();s++) {
	if (str.charAt(s)=='a'|| str.charAt(s)=='e'||str.charAt(s)=='i'||str.charAt(s)=='o'||str.charAt(s)=='u'|| str.charAt(s)=='A'|| str.charAt(s)=='E'||str.charAt(s)=='I'||str.charAt(s)=='O'||str.charAt(s)=='U') {
		System.out.print(" "+str.charAt(s));{
			
		}
	}}} 
}			 



