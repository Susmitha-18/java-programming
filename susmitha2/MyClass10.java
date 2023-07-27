package susmitha.s;
import java.util.Scanner;
/*multiplication table*/
public class MyClass10 {

	public static void main(String[] args) {
		int i=1;
		Scanner susmi =new Scanner (System.in);
		System.out.println("enter a number : ");
	int num=susmi.nextInt();
		System.out.print("enter range: ");
		int range=susmi.nextInt();
		while(i<=range)
		{
				System.out.println(num+" * "+i+" = "+num * i );
			i++;
			}
	}}
