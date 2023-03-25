package maccess;
import java.util.*;
import test.product;
public class DemoArray3 {
	public static void main (String[]args) {
		Object o[]=new Object[3];
		o[0]=new Integer(111);//Integer WrapprClass object
		o[1]=new String("NITHYD");//String Object
		o[2]=new product("A234","Mou",1200,12);
		//User defined Class Product Object
		System.out.println("===Object Array===");
		Spliterator<Object>sp=Arrays.spliterator(0);
		sp.forEachRemaining((k)->
		{
			System.out.println(k.toString());
		});	
	}
}
