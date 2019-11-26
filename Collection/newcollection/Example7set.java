package newcollection;
import java.util.*;
public class Example7set {

public static void main(String[] args) {
HashSet<String> set=new HashSet<String>();
set.add("mariya");
set.add("joy");
set.add("joe");
set.add("siji");
set.add("kate");
set.add("edword");
set.add("joe");
set.add("chinj");
set.add("riju");
Iterator<String> itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}


	

