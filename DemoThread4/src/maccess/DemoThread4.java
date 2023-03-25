package maccess;
import test.*;
public class DemoThread4 {
	public static void main(String [] args) {
		new Thread(Display1 ::m1).start();
		new Thread(Display2 ::m2).start();
	}
}
