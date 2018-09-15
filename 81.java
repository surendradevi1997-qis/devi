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
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		if(n>m)
		{
			System.out.println(n-m);
		}
		else
		{
			System.out.println(m-n);
		}
	}
}
