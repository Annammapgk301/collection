package newcollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		ArrayList list=new ArrayList();//arraylist class creation(class object=new class)
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			list.add(name);//add method
			list.add(age);
		}
		ArrayList list1=(ArrayList) list.clone();
		System.out.println("clone value "+list1.get(0));
		System.out.println(list.get(0));//get method
		list.remove(0);
		String name1=sc.next();
		list.set(0,name1);
		System.out.println(list.get(0));
		list.clear();//clear
		list.removeAll(null);
		Iterator itr=list.iterator();//used to traverse a element one by one
		while(itr.hasNext())//boolean hasNext():Returns true if the iteration has more element
		{
			System.out.println(itr.next());
			
		}
		
	}

}
