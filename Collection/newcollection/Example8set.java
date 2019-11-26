package newcollection;
import java.util.*;
public class Example8set {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<NewCard> s=new TreeSet<NewCard>(new Symbol());
		NewCard[] c=new NewCard[40];
		int n=sc.nextInt();
		int count=0;
		
		while(s.size()<n)
		{
			String symbol=sc.next();
			int num=sc.nextInt();
			c[count]=new NewCard();
			c[count].setSymbol(symbol);
			c[count].setNum(num);
			s.add(c[count]);
			count++;
		}
		System.out.println(n+"symbols gathered in"+count+" cards.");
		System.out.println("card are");
		Iterator<NewCard> itr=s.iterator();
		while(itr.hasNext())
		{
			NewCard ca=(NewCard)itr.next();
			System.out.println(ca.getSymbol()+" "+ca.getNum());
		}
		
			}

		}

		

