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
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		char ch=sc.next().charAt(0);
		int b=sc.nextInt();
		if(ch=='/')
		{
			System.out.println(a/b);
		}
		else
		{
			System.out.println(a%b);
		}
	}
}
