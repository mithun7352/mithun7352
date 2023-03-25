package test;
public class Display1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Task-1 : "+i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {e.printStackTrace();}
		}
	}
}
