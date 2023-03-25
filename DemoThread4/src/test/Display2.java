package test;
public class Display2 
{
	public static void m2() {
		for(int i=101;i<=105;i++) {
			System.out.println("Task-2 : "+i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {e.printStackTrace();}
		}
	}
}
