package maccess;
import java.util.*;
public class ArraySorting {
	@SuppressWarnings("removal")
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n =s.nextInt();
		Integer a[]=new Integer[n];
		System.out.println("Enter "+n+"Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=new Integer(s.nextInt());//Adding to Array object
		}//end of loop
		System.out.println("\n====Before Sorting====");
		Spliterator<Integer> sp1=Arrays.spliterator(a);
		sp1.forEachRemaining((p)->
		{
			System.out.print(p+" ");
		});
		System.out.println("\n====Ascending Order====");
		Arrays.sort(a);//Sorting process
		Spliterator<Integer> sp2=Arrays.spliterator(a);
		sp2.forEachRemaining((p)->
		{
			System.out.print(p+" ");
		});
		System.out.println("\n====Decending Order====");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}//end of loop
		s.close();
		}
}
