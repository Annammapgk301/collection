package newcollection;
import java.util.*;
public class Example5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList list=new ArrayList();//create object
		for(int i=0;i<=n;i++)
		{
			System.out.println("Enter the name");
			String name=sc.next();
			list.add(name);
			System.out.println("Enter the age");
			int age=sc.nextInt();
			list.add(age);
		}
		ArrayList list1=new ArrayList();
		for(int i=0;i<=n;i++)
		{
			System.out.println("Enter the name");
			String name1=sc.next();
			list.add(name1);
			System.out.println("Enter the age");
			int age1=sc.nextInt();
			list1.add(age1);
		}
		list.addAll(list1);
		list.clear();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
	
			
	