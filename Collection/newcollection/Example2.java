package newcollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int i,n;
String name;
System.out.println("Enter the size");
n=sc.nextInt(); 
ArrayList al=new ArrayList();
Employee[] emp=new Employee[n];
for(i=0;i<n;i++)
{
	System.out.println("Enter the name");
	name=sc.next();
	System.out.println("Enter the age");
	int age=sc.nextInt();
	emp[i]=new Employee();
	emp[i]=setName(name);
	emp[i]=setAge(age);

	al.add(emp[i]);
}
Iterator<Employee> itr=al.iterator();
while(itr.hasNext())
{
	Employee e=itr.next();
	System.out.println(e.getName()+" "+e.getAge());
}
	}

	

	private static Employee setName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
