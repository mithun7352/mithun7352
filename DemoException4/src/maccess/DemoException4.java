package maccess;
import java.util.*;
import test.*;
public class DemoException4 extends Exception
{
	public DemoException4(String msg)
	{
		super(msg);
	}
	public static void main(String[]args) {
		try(Scanner s=new Scanner(System.in);)//java7
		{
			int count=0;
			xyz:
				while(true)
				{
					try
					{
						System.out.println("Enter the pinNo:");
						int pinNo=s.nextInt();
						CheckPinNo ob=new CheckPinNo();//Con_call
						ob.verify(pinNo);//method _call
						System.out.println("===Choice===");
						System.out.println("1.WithDraw\n2.Deposit");
						System.out.println("Enter the Choice:");
						switch(s.nextInt())
						{
						case 1:
							System.out.println("Enter the amt:");
							int a1=s.nextInt();
							if(!(a1>0&&a1%100==0))//Exception-Condition
							{
								DemoException4 ob3= new DemoException4
										("Invaild amt...");
								throw ob3;
							}
							//Withdraw class as Anonymous
							Transaction wd=new Transaction()
									{
								public void process(int amt)throws Exception
								{
									try
									{
										if(amt>b.bal)//Exception-condition
										{
											Exception w=new Exception("InSufficient fund...");
											throw w;
										}
										System.out.println("Amt withDrawn:"+amt);
										b.bal=b.bal-amt;
										b.getBalance();
										System.out.println("Transaction Completed...");
									}//end of try
									catch(Exception w)
									{
										throw w;
									}
								}
									};
									wd.process(a1);//method call
									break xyz;
						case 2:
							System.out.println("Enter the amt:");
							int a2 =s.nextInt();
							if(!(a2>0&&a2%100==0))//Exception-Condition
							{
								DemoException4 ob3=new DemoException4
										("Invaild amt...");
								throw ob3;
							}
							//Deposit class as Anonymous
							Transaction dp =new Transaction()
									{
								public void process(int amt) {
									System.out.println("Amt Deposited:"+amt);
										b.bal=b.bal+amt;
										b.getBalance();
							 System.out.println("Transaction Completed...");
								}
									};
									dp.process(a2);//method call
									break xyz;
									default:
										System.out.println("Invaild Choice..");
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
						catch(DemoException4 ob3)
						{
							System.out.println(ob3.getMessage());
							break xyz;
						}
						catch(Exception w)
						{
							System.out.println(w.getMessage());
							break xyz;
						}
					}//end of loop
				}//end of try-with-resource
		}
	}


