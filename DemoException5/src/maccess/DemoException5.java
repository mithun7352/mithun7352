package maccess;
import java.util.*;	
import test.*;
@SuppressWarnings("serial")
public class DemoException5 extends Exception
{
	public DemoException5(String msg)
	{
		super(msg);
	}
	public static void main(String[]args) throws Exception {
		Scanner s=new Scanner(System.in);
		try(s;)//java9
		{
			int count=0;
			xyz:
				while(true)
				{
					try
					{
						System.out.println("Enter the pinNo:");
						int pinNo=s.nextInt();
						CheckPinNo ob =new CheckPinNo();//Con_call
						ob.verify(pinNo);//method_call
						System.out.println("===Choice===");
						System.out.println("1.withDraw\n2.Deposit");
						System.out.println("Enter the Choice:");
						switch(s.nextInt())
						{
						case 1:
							System.out.println("Enter the amt:");
							int a1=s.nextInt();
							if(!(a1>0&&a1%100==0))//Exception-Condition
							{
								DemoException5 ob3=new DemoException5("Ivaild amt:...");
								throw ob3;
							}
							//withDraw class as Anonymous
							Transaction wd=(int amt)->
							{
								try
								{
									if(amt>Transaction.b.bal)//Exception-condition
									{
										Exception w=new Exception("InSufficient fund...");
										throw w;
									}
									System.out.println("Amt withdraw:"+amt);
									Transaction.b.bal=Transaction.b.bal-amt;
									Transaction.b.getBalance();
									System.out.println("Transaction completed...");
								}//end of try
								catch(Exception w)
								{
									throw w;
								}
							};
							wd.process(a1);//method call
							break xyz;
						case 2:
							System.out.println("Enter the amt:");
							int a2=s.nextInt();
							if(!(a2>0&&a2%100==0))//Exception condition
							{
								DemoException5 ob3=new DemoException5("Invaild amt:");
								throw ob3;
							}//Deposit class as Anonymous
							Transaction dp=new Transaction()
									{
								public void process(int amt) {
									System.out.println("amt deposite:"+amt);
									b.bal=b.bal+amt;
									b.getBalance();
									System.out.println("Transaction comleted...");
								}
							};
							dp.process(a2);//method call
							break xyz;
							default:
								System.out.println("Invaild choice...");
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
						catch(DemoException5 ob3)
						{
							System.out.println(ob3.getMessage());
							break xyz;
						}
					}//end of loop
				}//end of enhanced try-with-resource
		}
	}
	

