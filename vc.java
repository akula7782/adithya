/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  char ch;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the character you want to check:");
        ch = (char) bf.read();
        switch(ch)
        {
            case 'a':
            System.out.println(" vowel");
            break;
 
            case 'e':
            System.out.println(" vowel");
            break;
 
            case 'i':
            System.out.println(" vowel");
            break;
 
            case 'o':
            System.out.println(" vowel");
            break;
               case 'u':
            System.out.println(" vowel");
            break;
 
            default:
            System.out.println(" consonant");
            break;
        
    }
	}
}
