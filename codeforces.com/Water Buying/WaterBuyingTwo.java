package test;

import java.util.Scanner;

public class WaterBuyingTwo 
{
	public static void main(String args[])
	{
		 Scanner in = new Scanner(System.in);
		 
	     int q;
	     q=Integer.parseInt(in.nextLine().trim());
	     
	     for(int i=0 ; i<q ; i++)
	     {
	    	 String[] temp = in.nextLine().split(" ");
	    	 costing(Long.valueOf(temp[0]),Long.valueOf(temp[1]),Long.valueOf(temp[2]));
	     }
	     //costing(array,q);     
	}
	public static void costing(long n ,long a,long b)
	{
		if(n%2 == 0)
		{	
			System.out.println((n/2)*b > n*a  ?  n*a : (n/2)*b);
		}
		if(n == 1)
		{
			System.out.println(a);
		}
		else if(n%2 == 1)
		{
			System.out.println(((n/2)*b+a) > (n*a) ? (n*a) : ((n/2)*b+a));
		} 
	}
}

