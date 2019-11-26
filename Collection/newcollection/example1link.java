package newcollection;
import java.util.*;
public class example1link {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	LinkedList<String> list=new LinkedList<String>();
	for(int i=0;i<n;i++)
	{
		String name=sc.next();
		list.add(name);
		String age=sc.next();
		list.add(age);
		String address=sc.next();
		list.add(address);
	}
	System.out.println(list);
	System.out.println("size of list"+list.size());
	System.out.println("list is "+list.isEmpty());
		
		
		
		
	}
	
	
	}

