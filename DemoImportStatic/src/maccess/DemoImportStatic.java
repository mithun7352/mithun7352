package maccess;
import java.util.Scanner;
import static java.lang.Math.*;
public class DemoImportStatic {


	public void main (String[]args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value:");
		double val=s.nextDouble();
		double result=sqrt(val);//Method_call
		System.out.println("sqrt"+val+"is"+result);
	    s.close();
	}

}
