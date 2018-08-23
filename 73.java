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
		int n,m,p;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		p=s.nextInt();
		m=s.nextInt();
		if (n >=p && n <=m) {
			System.out.println("yes");
		}
		else
		{
		System.out.println("no");
		}
	}
}
