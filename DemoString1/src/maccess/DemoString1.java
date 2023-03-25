package maccess;
import java.util.Scanner;
public class DemoString1 {
	public static void main(String[]args) {
		Scanner s =new Scanner (System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		System.out.println("str"+str.toString());
		int len =str.length();
		System.out.println("length of str:"+len);
		System.out.println("===Display String in reverse===");
		for(int i=0;i<=len-1; i++)
		{
			char ch = str.charAt(i);
			System.out.println(ch+" ");
			}
		System.out.println("====Display string in reverse===");
		for(int i=len-1;i>=0;i--)
		{
			char ch = str.charAt(i);
		System.out.println(ch+" ");
		}
		s.close();
		
	}

}
