package test;
@SuppressWarnings("serial")
public class WithDraw extends Exception implements Transaction
{
	public WithDraw() {}
	public WithDraw(String msg)
	{
		super(msg);
	}
	public void process(int amt)throws WithDraw
{
	try
	{
		if(amt>b.bal)//Exception-condition
		{
			WithDraw w=new WithDraw("InSufficient fund...");
			throw w;
		}
		System.out.println("Amt withDraw:"+amt);
		b.bal=b.bal-amt;
		b.getBalance();
		System.out.println("Transaction Completed...");
		}//end of try
	catch(WithDraw w)
	{
		throw w;
	}
}
}
