package maccess;

public class DemoString5 {
public static void main(String[]args) {
	String s1="java";
	String s2="language";
	String s3="progaram";
	String s4=s1+s2+s3;
	System.out.println("s4:"+s4.toString());
	String s5=s1.concat(s2);
	System.out.println("s5:"+s5.toString());
	String s6=s1.concat(s2).concat(s3);
	System.out.println("s6:"+s6.toString());
}
}
