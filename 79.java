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
		int n,m,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		k=n*m;
		if(k/n==n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
