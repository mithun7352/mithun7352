package test;
public class productValues {
	public String prodName;
	public float prodPrice;
	public int prodQty;
	public productValues(String prodName,float prodPrice,int prodQty)
	{
		this.prodName=prodName;
		this.prodPrice=prodPrice;
		this.prodQty=prodQty;
	}
	public String toString() {
		return prodName+"\t"+prodPrice+"\t"+prodQty;
	}

}
