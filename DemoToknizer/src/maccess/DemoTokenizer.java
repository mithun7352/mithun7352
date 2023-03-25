package maccess;
import java.util.*;
public class DemoTokenizer {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("enter the String:");
String str = s.nextLine();
System.out.println("Enter the delimiter:");
String delimiter = s.nextLine();
StringTokenizer ob= new StringTokenizer(str,delimiter);
System.out.println("===number of Tokens===");
System.out.println("count:"+ob.countTokens());
System.out.println("===display Tokens===");
while(ob.hasMoreTokens())
{
	String tk = ob.nextToken();
	System.out.println(tk.toString());
	System.out.println("count:"+ob.countTokens());
}//end of loop
s.close();
	}

}
