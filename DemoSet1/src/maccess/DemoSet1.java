package maccess;
import java.util.*;;
public class DemoSet1 {
public static void main (String[]args) {
	Scanner s=new Scanner(System.in);
	Set<Integer> ob = null;//reference Variable
	System.out.println("===Choice===");
	System.out.println("1.HashSet<E>\n2.LinkedHashSet<E>\n3.TreeSet<E>");
	switch(s.nextInt())
	{
	case 1:
		ob=new HashSet<Integer>();
		break;
	case 2:
		ob=new LinkedHashSet<Integer>();
		break;
	case 3:
		ob= new TreeSet<Integer>();
		break;
	default:
		System.out.println("invaild choice....");
		System.exit(0);//terminate the program
		}//end of the Switch
	System.out.println("Enter te number Integer object");
	int n= s.nextInt();
	System.out.println("Enter"+n+"Integer Objects");
	for(int i=1;i<=n;i++)
	{
		ob.add(new Integer(s.next()));
		//Adding element to set object 
		}//end of loop
	System.out.println("===Display Set<E>====");
	System.out.println(ob.toString());
	s.close();
	}  
}
