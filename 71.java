/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String original, reverse = ""; // Objects of String class
                        Scanner s= new Scanner(System.in);
 
                        original = s.nextLine();
 
                        int length = original.length();
 
                        for ( int i = length - 1; i >= 0; i-- )
                        reverse = reverse + original.charAt(i);
 
                           if (original.equals(reverse))
                                System.out.println("Yes");
                           else
                                 System.out.println("No");

	}
}
