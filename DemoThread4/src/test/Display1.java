package test;
public class Display1 {
	public static void m1() {
		for(int i=1;i<=5;i++) {
			System.out.println("Task-1 :"+i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {e.printStackTrace();}
		}
	}
}
