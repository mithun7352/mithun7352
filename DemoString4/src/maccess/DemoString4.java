package maccess;
import java.util.*;
public class DemoString4 {
public static void main(String[]args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the String");
String str=s.nextLine();
int len=str.length();
int ab=0,num=0,sum=0,count=0;
for(int i=0;i<=len-1;i++)
{
	char ch1=str.charAt(i);
	switch(ch1)
	{
	case 'a':
	case 'A':
	     count++;
	     break;
	case 'e':
	case 'E':
		count++;
		break;
	case 'i':
	case 'I':
			count++;
			break;
	case 'o':
	case 'O':
		count++;
		break;
	case 'u':
	case 'U':
		count++;
		break;
	}//end of switch
	int k=(int)ch1;//char to ASCII value
	if((k>65 && k<=90) ||(k>=97 && k<=122))
	{
		ab++;
	}
	if(k>=48 && k<=57)
	{
		num++;
		char ch2=(char)k;//ASCII to char
		String s1=String.valueOf(ch2);//char of String
		Object intger;
		int z = Integer.parseInt(s1);//String to integer
		
		sum=sum+z;
	}
}//end of loop
System.out.println("Number of Consonents:"+(ab-count));
System.out.println("Number of Vowels:"+count);
System.out.println("Number of Numrics:"+sum);
System.out.println("Sum of Numbers:"+sum);
System.out.println("others"+(len-(ab+num)));
s.close();
}
}
