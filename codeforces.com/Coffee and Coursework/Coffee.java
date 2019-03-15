package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Coffee 
{
	public static void main(String args[])
	{
		 Scanner in = new Scanner(System.in);
		 boolean flag =true;
	     int n,m;	     
	     n=in.nextInt();//Integer.parseInt(in.nextLine().trim());
	     m=in.nextInt();
	     List<Integer> list = new ArrayList<Integer>();
	     for(int i = 0 ; i < n; i++)
	     {
	    	 list.add(in.nextInt());	    	 
	     }
	     
	     Collections.sort(list);
	     Collections.reverse(list);
	     
	     for (int i = 1; i <= n; ++i) {
	 		int sum = 0;
	 		for (int j = 0; j < n; ++j) {
	 			sum += Math.max(list.get(j) - j / i, 0);
	 		}
	 		if (sum >= m) {
	 			System.out.println(i); 
	 			flag = false;
	 			break;
	 			
	 		}
	 	}
	    if(flag)
	    {
	    	System.out.println("-1");
	    }
	    
	
	}
}
