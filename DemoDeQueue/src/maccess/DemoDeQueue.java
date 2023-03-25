package maccess;
import java.util.*;
public class DemoDeQueue {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		Deque<Integer> dq=null;
		System.out.println("===Choice===");
		System.out.println("1.ArrayDeque<E>\n2.LinkedList<E>");
		System.out.println("Enter the choice");
		switch(s.nextInt())
		{
		case 1:
			dq=new ArrayDeque<Integer>();
			break;
		case 2:
			dq=new LinkedList<Integer>();
			break;
			default:
				System.out.println("Invaild choice...");
				System.exit(0);
				}//end of switch
		for(int i=11; i<=15; i++) {
			dq.add(new Integer(i));
		}//end of loop
		System.out.println(dq.toString());
		dq.addFirst(new Integer(600));
		dq.addLast(new Integer(700));
		System.out.println(dq.toString());
		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq.toString());
		dq.add(new Integer(11));
		System.out.println(dq.toString());
		dq.add(new Integer(12));
		System.out.println(dq.toString());
		dq.removeFirstOccurrence(new Integer(11));
		System.out.println(dq.toString());
		dq.removeLastOccurrence(new Integer(12));
		System.out.println(dq.toString());
	}
}
