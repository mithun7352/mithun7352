package maccess;
import java.util.*;
public class DemoArray4 {
	public static void main(String[]args) {
	Integer a1[]= {11,12,13};
	Integer a2[]= {21,23,22,25};
    Integer a3[]= {101,102,21,34,23};
    Integer a[][]={a1,a2,a3};//Bagged Array
    System.out.print("====Display jaggedArray=== ");
    Spliterator<Integer[]>spl = Arrays.spliterator(a);
	Spliterator<Integer[]> sp1;
	sp1.forEachRemaining((k)->
    {
    	System.out.print("Array: ");
    	Spliterator<Integer>sp2=Arrays.spliterator(k);
    	sp2.forEachRemaining((z)->
    	{
       System.out.print(z.toString()+" ");
       });
    System.out.print(z.toString()+" ");
});
}
}