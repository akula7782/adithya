import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   char c;
        Scanner sc = new Scanner(System.in);
		
        System.out.print(" ");
        c= sc.next().charAt(0);
		
        if(c=='a' || c=='A' || c=='e' || c=='E' ||
        c=='i' || c=='I' || c=='o' || c=='O' ||
        c=='u' || c=='U')
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
	}
}
}
