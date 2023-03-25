package maccess;
import java.util.*;
public class DemoQeue {
	public static void main(String[]args) {
		Queue<Integer> ob= new PriorityQueue<Integer>();
		for(int i=11; i<=15; i++)
		{
			ob.add(new Integer(i));
		}//end of loop
		System.out.println(ob.toString());
		System.out.println("peek ele:"+ob.peek());
		System.out.println(ob.toString());
		System.out.println("element:"+ob.element());
		System.out.println(ob.toString());
		System.out.println("poll:"+ob.poll());
		System.out.println(ob.toString());
		System.out.println("remove:"+ob.remove());
		System.out.println(ob.toString());
	}
}
