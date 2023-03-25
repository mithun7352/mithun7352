package maccess;
import java.util.*;
public class DemoList2 {
	public static void main (String[]args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		for(int i=1; i<=5; i++)
		{
			a1.add(new Integer(i));
		}//end of loop
		System.out.println(a1.toString());
		a1.add(3,new Integer(500));//Adding by index
		System.out.println(a1.toString());
		a1.remove(3);//removing by index
		System.out.println(a1.toString());
		a1.set(3, new Integer(700));//replace by index
		System.out.println(a1.toString());
		Integer ele = a1.get(3);//getting the element by index
		System.out.println("Ele at index 3:"+ele.toString());
		for(int i=1; i<=5; i++)
		{
			a1.add(new Integer(i));
		}
		System.out.println(a1.toString());
		int p = a1.indexOf(new Integer(5));
		System.out.println("first index of 5:"+p);
		int q = a1.lastIndexOf(new Integer(5));
		System.out.println("last index of 5:"+q);
	}

}
