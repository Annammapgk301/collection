package newcollection;
import java.util.Scanner;
class exam1
{
  public static void main(String [] args)
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  int max=a[0],min=a[0],sum=0;
	  int i,j,k;
	  for(i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  for(j=0;j<n;j++)
	  {
		  if(max<a[j])
		  {
			  max=a[i];
		  }
	  }
	  for(k=0;k<n;k++)
	  {
		  if(min>a[k])
		  {
			  min=a[k];
		  }
	  }
	  for(int r=0;r<n;r++)
	  {
		  if(a[r]!=max || a[r]!=min)
		  {
			  sum=sum+a[r];
		  }
	  }
	  float avg=sum/n-1;
	  System.out.println(avg);
  }
}

   
 
