package maccess;
import java.util.*;
public class DemoException1 extends Exception
{
	public DemoException1(String msg)
	{
		super(msg);
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	try
	{
		System.out.println("enter the bsal:");
		int bSal = s.nextInt();//Exception for Non-integer value
		if(bSal<12000)//Exception-Condition
		{
			DemoException1 ob= new DemoException1("Invaild bsal");
			throw ob;//throwing object_ref to catch block
		}
		float totSal = bSal+(0.93F*bSal)+(0.63F*bSal);
		System.out.println("Bsal:"+bSal);
		System.out.println("totsal:"+totSal);
	}//end of try
	catch(InputMismatchException ime)
	{
		System.out.println("Enter only Integer value...");
	}
	catch(DemoException1 ob)
	{
		System.out.println(ob.getMessage());
	}
		finally
		{
			s.close();
		}
	}
}
