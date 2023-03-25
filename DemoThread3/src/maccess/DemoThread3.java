package maccess;
public class DemoThread3 {
	public static void main(String[] args) {
		Thread t1 =new Thread(() ->
		{
			for(int i=1;i<=11;i++) {
				 System.out.println("Task-1 : "+i);
				 try {
				Thread.sleep(2000);
				}catch(Exception e) {e.printStackTrace();}
			}
		});
		Thread t2 =new Thread (()->
		{
			for(int i=101;i<=111;i++) {
				System.out.println("Task-2  :"+i);
				try {
					Thread.sleep(2000);
				}catch(Exception e) {e.printStackTrace();}
			}
		});
		t1.start();
		t2.start();
				}
		}
