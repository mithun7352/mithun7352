package maccess;
import test.Product;
import java.util.*;
public class DemoArray {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of products:");
		int n= Integer.parseInt(s.nextLine());
		Product p[]=new Product[n];
		System.out.println("Enter"+n+"Products");
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter Productcode-"+(i+1));
			String code = s.nextLine();
			System.out.println("Enter the Productname-"+(i+1));
			String name =s.nextLine();
			System.out.println("Enter the Productprice-"+(i+1));
			Float price = Float.parseFloat(s.nextLine());
			System.out.println("Enter the ProductsQty-"+(i+1));
			int qty = Integer.parseInt(s.nextLine());
			p[i]=new Product(code,name,price,qty);//con_call  
			}//end of loop
		System.out.println("===Spliterator===");
		Spliterator<Product>sp=Arrays.spliterator(p);
		sp.forEachRemaining((k)-> 
		{
			System.out.println(k.toString());
		});
		s.close();
		}
	}


