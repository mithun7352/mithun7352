package maccess;
import java.util.*;
public class DemoTypeCast {
	public static void main(String[]args) {
		//Widening process
		char ch1='A';
		int k=(int)ch1;
		System.out.println("ASCII value of A:"+k);
		//narrowing process
		int z= 86;
		char ch2 =(char)z;
		System.out.println("char at ASCII value 86:"+ch2);
	}
}
