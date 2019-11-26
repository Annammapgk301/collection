package newcollection;
import java.util.*;
public class Example3 {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    ArrayList<String> list=new ArrayList();
		      list.add("anna");
		      list.add("eliza");
		      list.add("jiby");
		    ArrayList<String> list2=new ArrayList();
		      list2.add("minku");
		    list.addAll(list2);
		    Iterator itr=list.iterator();
		    while(itr.hasNext())
		    {
		      System.out.println(itr.next());
		    }
		  }
		

		    
		    
		  

	}

