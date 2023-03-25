package macess;
import java.util.*;
import test.Cars;
public class DemoEnum {
	public static void main(String[]args) {
		Cars c[] = Cars.values();//Generate Array holding Enum_objects
		System.out.println("===Enum data====");
		Spliterator<Cars> sp = Arrays.spliterator(c);
		sp.forEachRemaining((k)->
		{
			System.out.println(k.toString()+"Costs"+k.getprice()+"thousand dollars");
		});
	}
      
}
