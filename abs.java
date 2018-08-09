import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int h1,m1,h2,m2;
		Scanner sc=new Scanner(System.in);
		h1=sc.nextInt();
		m1=sc.nextInt();
		h2=sc.nextInt();
		m2=sc.nextInt();
		int k=Math.abs(h2-h1);
		int l=Math.abs(m2-m1);
		System.out.println(k+ " "+l);
		
	}
	
}
