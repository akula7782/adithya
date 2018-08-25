import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int i,j,k,t;
	   int a[]=new int[3];
	   Scanner sc=new Scanner(System.in);
	   k=sc.nextInt();
       for(i=0;i<k;i++)
    {
        a[i]=sc.nextInt();
        }
    for(i=0;i<k;i++)
    {
        for(j=i+1;j<k;j++)
        {
            if(a[i]>a[j])
            {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
    }
    System.out.println(a[0]+ " ");
     System.out.println(a[k-1]+ " ");
	}
}
