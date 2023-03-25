package test;
import test.StudentResult;
import java.util.Scanner;
public class DemoStudent {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Marks of sub1:");
		int s1 =s.nextInt();
		System.out.println("Enter Marks of sub2:");
		int s2 =s.nextInt();
		System.out.println("Enter Marks of sub3:");
		int s3 =s.nextInt();
		System.out.println("Enter Marks of sub4:");
		int s4 =s.nextInt();
		System.out.println("Enter Marks of sub5 :");
		int s5 =s.nextInt();
		System.out.println("Enter Marks of sub6:");
		int s6 =s.nextInt();
		boolean p= false;
		if((s1>=0 && s1<=100) && (s2>=0 && s2<=100)&&
			(s3>=0 && s3<=100)&& (s4>=0 && s4<=100)&&
			(s5>=0 && s5<=100)&&(s6>=0 && s6<=100))
		{
			if(s1<=34 || s2<=34 || s3<=34 || s4<=34  ||
					s5<=34 || s6<=34)
			{
				p=true;
			}//end of if
			int totMarks =s1+s2+s3+s4+s5+s6;
			float per= (float)totMarks/6;
			StudentResult sr = new StudentResult();
			String result =sr.generate(per, p);
			System.out.println("===StudentResult===");
			System.out.println("Tomarks:"+totMarks);
			System.out.println("percentage:"+per);
			System.out.println("Result:"+result);
		}///end of
		else
		{
			System.out.println("Invaild Marks...");
		}
		s.close();
	}
}
