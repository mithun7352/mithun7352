package maccess;
import java.util.*;
public class DemoList1 {
	@SuppressWarnings("removal")
	public static void main(String[]args) {
		System.out.println("****ArrayList()****");
		ArrayList<Integer>a11 =new ArrayList<Integer>();
		System.out.println("size:"+a11.size());
		for (int i=1; i<=3; i++)
		{
		a11.add(new Integer(i));
		}
		System.out.println(a11.toString());
		System.out.println("size:"+a11.size());
		System.out.println("****ArrayList(int)****");
		ArrayList<Integer> a12=new ArrayList<Integer>(4);
		System.out.println("size:"+a12.size());
		for(int i=1; i<=3; i++)
		{
			a12.add(new Integer(i));
		}
		System.out.println(a12.toString());
		System.out.println("size:"+a12.size());
		System.out.println("****ArryList(Collection<E>)****");
		ArrayList<Integer> a13 = new ArrayList<Integer>(a12);
		System.out.println("size:"+a13.size());
		System.out.println(a13.toString());
		for(int i=11; i<=13; i++)
		{
			a13.add(new Integer(i));
		}
		System.out.println("size:"+a13.size());
		System.out.println(a13.toString());
	}
}
