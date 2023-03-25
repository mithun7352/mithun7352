package test;

@SuppressWarnings("serial")
public class CheckPinNo extends Exception {
	public CheckPinNo() {}
	public CheckPinNo(String msg)
	{
		super(msg);
	}
	public void verify(int pinNo) throws CheckPinNo
	{
		try
		{
			switch(pinNo)
			{
			case 1111:
			case 2222:
			case 3333:
			break;
			default ://Exception-condition
				CheckPinNo cpn =new CheckPinNo("Invaild pinNo");
				throw cpn;
			}
		}//end of try
		catch(CheckPinNo cpn)
		{
			throw cpn;//re-throwing process
		}
	}
}
