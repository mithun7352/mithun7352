package maccess;
import java.util.*;
public class DemoString3 {
	public static void main(String[]args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		String s1=str.substring(4);
		String s2=str.substring(2,5);
		System.out.println("s1:"+s1.toString());
		System.out.println("s2:"+s2.toString());
		s.close();
	}
}
