package maccess;
import java.util.*;
public class DemoVector {
	public static void main(String[]args) {
		Vector<Integer> v=new Vector<Integer>();
		System.out.println("default capacity:"+v.capacity());
		System.out.println("size:"+v.size());
		for(int i=11;i<=20;i++)
	{
			v.addElement(new Integer(i));
		}
		System.out.println(v.toString());
	System.out.println("capacity:"+v.capacity());
		System.out.println("size:"+v.size());
		v.insertElementAt(new Integer(700),2);
		System.out.println(v.toString());
	System.out.println("capacity:"+v.capacity());
		System.out.println("size:"+v.size());
		System.out.println("first Element:"+v.firstElement());
		System.out.println("last Element:"+v.lastElement());
		for(int i=11;i<=20;i++)
		{
		v.addElement(new Integer(i));
	}
		System.out.println(v.toString());
	System.out.println("capacity:"+v.capacity());
		System.out.println("size:"+v.size());
	}
}
