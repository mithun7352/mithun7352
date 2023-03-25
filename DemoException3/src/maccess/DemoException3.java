package maccess;
import java.util.*;
import test.*;
@SuppressWarnings("serial")
public class DemoException3 extends Exception
{
	public DemoException3(String msg)
	{
		super(msg);
	}
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int count=0;
		xyz:
			while(true)
			{
				try
				{
					System.out.println("Enter the pinNo:");
					int pinNo=s.nextInt();
					CheckPinNo ob = new CheckPinNo();//Con_call
					ob.verify(pinNo);//method call
			        System.out.println("===Choice===");
			        System.out.println("1.WithDraw\n2.Deposit");
			        System.out.println("Enter the Choice:");
			        switch(s.nextInt())
			        {
			        case 1:
			        	System.out.println("Enter the amt:");
			        	int a1= s.nextInt();
			        	if(!(a1>0&&a1%100==0))//Exception-Condition
			        	{
			        		DemoException3 ob3=new DemoException3("Invaild amt...");
			        		throw ob3;
			        	}
			        	WithDraw wd=new WithDraw();
			        	wd.process(a1);//method call
			        	break xyz;
			        case 2:
			        	System.out.println("Enter the amt:");
			        	int a2 =s.nextInt();
			        	if(!(a2>0&&a2%100==0))//Exception-condition
			        	{
			        		DemoException3 ob3=new DemoException3("Invaild amt...");
			        		throw ob3;
			        	}
			        	Deposit dp=new Deposit();
			        	dp.process(a2);//method call
			        	break xyz;
			        	default:
			        		System.out.println("Invalid choice...");
			        		break xyz;
			        		
			        }//end of switch
			        
				}//end of try
				catch(CheckPinNo cpn)
				{
				System.out.println(cpn.getMessage());
				count++;
				if(count==3)
				{
					System.out.println("Transaction blocked");
					System.exit(0);
				}
				}
				catch(DemoException3 ob3)
				{
					System.out.println(ob3.getMessage());
					break xyz;
				}
				catch(WithDraw w)
				{
					System.out.println(w.getMessage());
					break xyz;
				}
			}//end of loop
	}
}

