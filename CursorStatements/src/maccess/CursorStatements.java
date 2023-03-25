package maccess;
import test.Customer;
import java.util.*;
public class CursorStatements {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		Vector<Customer> v=new Vector<Customer>();
		System.out.println("Enter the number of Customers");
		int n=Integer.parseInt(s.nextLine());
		System.out.println("Enter"+n+"Customers");
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the CustId:");
			String id = s.nextLine();
			System.out.println("Enter the CustName:");
			String name=s.nextLine();
			System.out.println("Enter the CustMailId:");
			String mailId=s.nextLine();
			System.out.println("Enter the CustphNo:");
			long phNo=Long.parseLong(s.nextLine());
			System.out.println("Enter the CustCity:");
			String city=s.nextLine();
			v.add(new Customer(id,name,mailId,phNo,city));
		}//end of loop
		System.out.println("====Iterator<E>====");
		ListIterator<Customer> li =v.listIterator();
		System.out.println("****Forward****");
		while(li.hasNext()) {
			System.out.println("****Backward****");
			while(li.hasPrevious()) {
				System.out.println(li.previous());
			}}//end of loop
				System.out.println("===Enumeration<E>====");
				Enumeration<Customer>e=v.elements();
				while(e.hasMoreElements()) {
					System.out.println(e.nextElement());
				}//end of loop
				System.out.println("====Soliterator<T>(java8)====");
				Spliterator<Customer> sp=v.spliterator();
				sp.forEachRemaining((z)->
				{
					System.out.println(z.toString());
		});
		
	}
}
