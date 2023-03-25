package maccess;
import java.util.*;
import test.productValues;
public class DemoMap1{
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		Map<String,productValues>m=null;
		System.out.println("===choice===");
		System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.Hashtable");
		System.out.println("Enter the Choice:");
		switch(Integer.parseInt(s.nextLine()))
		{
		case 1:
			m=new HashMap<String,productValues>();
			break;
		case 2:
			m=new LinkedHashMap<String,productValues>();
			break;
		case 3:
			m=new TreeMap<String,productValues>();
			break;
		case 4:
			m=new Hashtable<String,productValues>();
			break;
			default:
				System.out.println("Invaild Choice...");
				System.exit(0);
		}//end of switch
		System.out.println("Enter the number of Products:");
		int n=Integer.parseInt(s.nextLine());
		System.out.println("Enter"+n+"Product Details:");
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the ProductCode-"+i);
			String code=s.nextLine();
			System.out.println("Enter the ProdName-"+i);
			String name=s.nextLine();
			System.out.println("Enter the ProdPrice-"+i);
			float price =Float.parseFloat(s.nextLine());
			System.out.println("Enter the prodQty-"+i);
			Integer qty= Integer.parseInt(s.nextLine());
			m.put(new String(code),new productValues(name,price,qty));
			//Adding to Map object
		}//end of loop
		System.out.println("===Display Map<K,V>===");
		m.forEach((p,q)->
		{
			System.out.println(p+"\t"+q);
		});
		System.out.println("===Display Keys===");
		Set<String>ob1=m.keySet();
		ob1.forEach((k)->
		{
			System.out.println(k);
		});
		System.out.println("===Display Values===");
		Collection<productValues> ob2=m.values();
		ob2.forEach((z)->
		{
			System.out.println(z);
		});
		while(true)
		{
			System.out.println("===Choice===");
			System.out.println("1.AddOperation\n2.removeOperation\n3.exit");
			System.out.println("Enter the Choice");
			switch(Integer.parseInt(s.nextLine()))
			{
			case 1:
				System.out.println("Enter the productCode:");
				String pC=s.nextLine();
				System.out.println("Enter the prodnmae:");
				String pN=s.nextLine();
				System.out.println("Enter the productprice:");
				float pP=Float.parseFloat(s.nextLine());
				System.out.println("Enter the productQty:");
				Integer pQ=Integer.parseInt(s.nextLine());
				m.put(new String(pC),new productValues(pN,pP,pQ));
				System.out.println("product Added Successfully...");
				System.out.println("===Display map<K,v>===");
				m.forEach((p,q)->
				{
					System.out.println(p+"\t"+q);
				});
				break;
			case 2:
				System.out.println("Enter the ProdCode:");
				String pCC=new String(s.nextLine());
				if(m.containsKey(pCC)) {
					m.remove(pCC);
					System.out.println("product details deleted...");
					System.out.println("====Display Map<K,V>====");
					m.forEach((p,q)->
					{
						System.out.println(p+"\t"+q);
					});
				}else {
					System.out.println("Invaild product key...");
				}
				break;
			case 3:
				System.out.println("Map Operation Stopped...");
				System.exit(0);
				default:
					System.out.println("Invaild Choice...");
			}//end of switch
		}//end of loop
	}
}