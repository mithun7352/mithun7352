package maccess;
import java.util.*;;
public class DemoString2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the String:");
		String str =s.nextLine();
		int len =str.length();
		int count=0;
		for(int i=0;i<=len-1;i++)
		{
			char ch =str.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'A':
				System.out.println(ch+" ");
				count++;
				break;
			case 'e':
			case 'E':
				System.out.println(ch+" ");
				count++;
			case 'i':
			case 'I':
				System.out.println(ch+" ");
				count++;
				break;
			case 'o':
			case 'O':
				System.out.println(ch+" ");
				count++;
				break;
			case 'u':
			case 'U':
				System.out.println(ch+" ");
				count++;
				break;
				}//end of switch 
		}//end of loop
		System.out.println("\nCount of vowels:"+count);
		s.close();
		}
	}
