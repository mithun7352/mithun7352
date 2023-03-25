package p2;
import java.util.Scanner;
import p1.EmpData;
import p1.Display;
public class EmpDataClass{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter the EmpId:");
String id = s.nextLine();
System.out.println("Enter the EmpName:");

String name = s.nextLine();
System.out.println("Enter the EmpDesg:");
String desg = s.nextLine();
System.out.println("Enter the EmpSal:");
int sal = s.nextInt();
EmpData ed = new EmpData(id,name,desg,sal);//Con_Call
Display d = new Display();
d.dis(ed);
s.close();
}

}