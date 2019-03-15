package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Candies 
{
	public static void main(String args[])
	{
		 Scanner in = new Scanner(System.in);
		 
	     int q;	     
	     q=Integer.parseInt(in.nextLine().trim());
	     	     
	     List<Integer> list = new ArrayList<Integer>();
	     int sumevenb=0;
	     int sumoddb=0;
	     for(int i = 0 ; i < q; i++)
	     {
	    	 list.add(in.nextInt());
	    	 if (i%2 == 0)
		     {
	    		 sumevenb+=list.get(i);
		     }
		     else 
		     {
		       	sumoddb+=list.get(i) ;
		     }
	     }

	     cases(q ,list,sumevenb,sumoddb);
	
	}
	
	public static void cases(int q,List<Integer> weight,int sumevenb, int sumoddb)
	{	
		int sumodd=0,sumeven=0;
		int count = 0;
		for (int i = 0; i < q; i++) 
		{
			if (i % 2 == 0) 
			{
				sumevenb -= weight.get(i);
			} 
			else 
			{
				sumoddb -= weight.get(i);
			}

			if (sumodd + sumevenb == sumeven + sumoddb) 
			{
				count++;
			}
			if (i % 2 == 0) 
			{
				sumeven += weight.get(i);
			}
			else 
			{
				sumodd += weight.get(i);
			}

		}
		System.out.println(count);		
	}
}
