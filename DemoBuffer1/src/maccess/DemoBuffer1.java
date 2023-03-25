package maccess;
import java.util.*;
public class DemoBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
StringBuffer sb=new StringBuffer();
System.out.println("default capacity:"+sb.capacity());
System.out.println("length:"+sb.length());
System.out.println("Enter the String");
sb.append(s.nextLine());
System.out.println("sb:"+sb.toString());
System.out.println("capacity:"+sb.capacity());
System.out.println("lenghth:"+sb.length());
System.out.println("Enter the  String:");
sb.append(s.nextLine());
System.out.println("sb:"+sb.toString());
System.out.println("capacity:"+sb.capacity());
System.out.println("length:"+sb.length());
System.out.println("Enter the String:");
sb.append(s.nextLine());
System.out.println("sb:"+sb.toString());
System.out.println("capacity:"+sb.capacity());
System.out.println("length:"+sb.length());
System.out.println("===insert()===");
sb.insert(4,"NITHYD");
System.out.println("sb:"+sb.toString());
System.out.println("capacity:"+sb.capacity());
System.out.println("length:"+sb.length());
System.out.println("===delete===");
sb.delete(4, 10);
System.out.println("sb:"+sb.toString());
System.out.println("capacity:"+sb.capacity());
System.out.println("length:"+sb.length());
System.out.println("===reverse===");
sb.reverse();
System.out.println("sb:"+sb.toString());
s.close();
	}
}
