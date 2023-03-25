package maccess;
import java.util.*;
import test.*;
public class DemoStudent {
	public static void main(String[]args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Student RollNo:");
		String rollNo=s.nextLine();
		if(rollNo.length()==10)
		{
			System.out.println("Enter the Student Name:");
			String name=s.nextLine();
			System.out.println("Enter the Branch:");
			String branch=s.nextLine().toUpperCase();
			BranchVerification bv=new BranchVerification();
			boolean k=bv.verify(branch);
			if(k)
			{
				  GenerateBranch ob =new GenerateBranch();
				  String br = ob.generate(rollNo.substring(6,8));
				  if(br==null)
				  {
					  System.out.println("Invaild brCode in rollNo..");
				  }//end of if 
				  else
				  {
					  if(br.equals(branch))
					  {
						  int i=1,totmarks=0;
						  boolean p=false;
						  while(i<=6)
						  {
							  System.out.println("Enter marks of nSub"+i);
							  int sub = s.nextInt();
							  if(sub<0||sub>100)
							  {
								  System.out.println("invaild sub marks:");
								  continue;
								  //skip below lines in iteration
							  }
							  if(sub>=0&&sub<=34)
							  {
								  p=true;
							  }
							  totmarks=totmarks+sub;
							  i++;
						  }//end of loop
						  System.out.println("RollNo:"+rollNo);
						  System.out.println("Name:"+name);
						  System.out.println("Branch:"+branch);
						  System.out.println("TotMarks:"+totmarks);
						  float per=(float)totmarks/6;
						  System.out.println("per:"+per);
						  StudentResult sr= new StudentResult();
						  String result=sr.generate(per, p);
						  System.out.println("Result:"+result);
						  }//end if
		
					  else
					  {
						  System.out.println
						  ("RollNo not matched with branch");
						  
					  }
				  }
				  
			}//end
			else
			{
				System.out.println("Invalid branch..");
			}
		}//end of if
		else
		{
			System.out.println("Invaild RollNo...");
		}
		s.close();
	}
}
