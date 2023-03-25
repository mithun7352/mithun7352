package maccess;
public class DemoString7 {
public static void main(String[]args) {
	String s1=new String("java");
	String s2=new String("java");
	System.out.println("====new operater process====");
	if(s1==s2){
		System.out.println("Strings are not-Eqal...");
	}else {
		System.out.println("Strings are Not-Equal...");
	}
	String s3="java";
	String s4="java";
	System.out.println("===String Literal process===");
	if(s3==s4) {
		System.out.println("String are eqal...");
	}else {
		System.out.println("String are not-Eqal...");
	}
}
}