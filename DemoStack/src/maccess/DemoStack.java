package maccess;
import java.util.*;
public class DemoStack {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		Stack <Integer> ob=new Stack<Integer>();
		while(true) {
			System.out.println("===choice====");
			System.out.println("1:push\n2.pop\n3.peek\n4.search\n5.exit");
			System.out.println("Enter the Choice:");
			switch(s.nextInt())
			{
			case 1:
				System.out.println("Enter the Element:");
				ob.push(new Integer(s.nextInt()));
				System.out.println(ob.toString());
				break;
			case 2:
				if(ob.empty()) {
					System.out.println("Stack is empty....");
					}else {
						ob.pop();//element from top of stack
						System.out.println(ob.toString());
					    }
				break;
			case 3:
				if(ob.empty()) {
					System.out.println("Stack is empty:");
					}else {
						System.out.println(ob.toString());
						System.out.println("peek ele:"+ob.peek());
						}
				break;
			case 4:
				if(ob.empty()) {
					System.out.println("stack is empty:...");
				}else {
					System.out.println("Enter the ele to be Searched:");
					Integer ele =new Integer(s.nextInt());
					int pos = ob.search(ele);
					if(pos>0) {
						System.out.println("Ele found at pos:"+pos);
					}else {
						
					}
				}
				break;
			case 5:
				System.out.println("Stack operation stopped ...");
				System.exit(0);
				default:
					System.out.println("Invaild choice...");
			}//end of switch
		}//end of loop
	}
}
