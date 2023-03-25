package maccess;
import java.util.*;
public class ListSorting {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		System.out.println("Enter the number of elements:");
		int n = s.nextInt();
		System.out.println("Enter"+n+"Element");
		for(int i=1; i<=n; i++)
		{
			a1.add(new Integer(s.nextInt()));//Adding to List<E> object
		}//end of loop
		System.out.println("====Before Sorting====");
		Spliterator<Integer> sp1 = a1.spliterator();
		sp1.forEachRemaining((p)->
		{
			System.out.print(p+" ");
		});
		System.out.println("\n====Ascending Order====");
		Collections.sort(a1);//Sorting Process
		Spliterator<Integer> sp2=a1.spliterator();
		sp2.forEachRemaining((p)->{
			System.out.print(p+" ");
		});
			System.out.println("\n====Decending Order====");
			for(int i=a1.size()-1;i>0;i--)
			{
				Integer ele =a1.get(i);//Get ele_by_index
				System.out.print(ele+" ");
			}//end of loop
			s.close();
		}
	}
