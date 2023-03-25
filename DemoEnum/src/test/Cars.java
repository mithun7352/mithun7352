package test;
public enum Cars {
	Figo(900),Alto(500),Dezire(700);//Element
	public int price;//Variable
	private Cars(int price)//Constructor
	{
		this.price=price;
	}
	public int getprice()//method
	{
	return price;	
	}
}
