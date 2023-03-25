package maccess;
public class DemoBuffer4 {
	public static void main(String[]args) {
		StringBuffer sb1=new StringBuffer("NITHYD");
		System.out.println("===sb1===");
		sb1.append("Java");
		System.out.println("sb1:"+sb1.toString());
		System.out.println("capacity:"+sb1.capacity());
		System.out.println("length:"+sb1.length());
		StringBuffer sb2=new StringBuffer(sb1);
		System.out.println("===sb2===");
		System.out.println("sb2:"+sb2.toString());
		System.out.println("capacity:"+sb2.capacity());
		System.out.println("length:"+sb2.length());
	}
}
