package maccess;
import java.util.*;
public class DemoASCII {
	public static void main(String[]args) {
		System.out.println("****UpperCase Letters****");
		for(int i=65;i<=90;i++)
		{
			char ch =(char)i;//ASCII Value into char
			System.out.print(ch+" ");
		}
		System.out.println("\n****LowerCase Letters****");
		for(int i=97; i<=125;i++)
		{
			char ch =(char)i;//ASCII VALUE INTO CHAR
		    System.out.print(ch+" ");
		}
		System.out.println("\n****Number(0-9)****");
		for(int i=48; i<=57;i++)
		{
			char ch =(char)i;//ASCII value into char
			System.out.print(ch+" ");
		}
	}
}
