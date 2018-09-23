import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print(" ");
        ch = scan.next().charAt(0);
		
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
	}
}
}
