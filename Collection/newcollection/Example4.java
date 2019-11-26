package newcollection;
import java.util.*;
public class Example4 {

	public static void main(String[] args) {
				  Scanner sc=new Scanner(System.in);
				    int n=sc.nextInt();
				    ArrayList<String> list=new ArrayList();
				      list.add("anna");
				      list.add("eliza");
				      list.add("jiby");
				    ArrayList<String> list2=new ArrayList();
				      list2.add("minku");
				      list2.add("tinku");
				    list.addAll(list2);
				    System.out.println(list.get(1));
				    list.clear();
				    Iterator itr=list.iterator();
				    while(itr.hasNext())
				    {
				      System.out.println(itr.next());
				    }
				  }
}

				    
				    
				  

			