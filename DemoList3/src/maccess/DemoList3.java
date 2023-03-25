package maccess;
import java.util.*;
public class DemoList3 {
	public static void main(String[]args) {
		LinkedList<Integer> ll= new LinkedList();
		for(int i=11; i<=15; i++)
		{
			ll.add(new Integer(i));
		}//end of loop
		System.out.println(ll.toString());
		}
	}
