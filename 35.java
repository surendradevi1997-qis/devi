/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,i;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				count++;
	                        }
	            }
	        System.out.println(count);
	}
}
