package greedy;

import java.util.*; 
import java.lang.*; 
import java.io.*; 

class ActivitySelection 
{ 
	public static void printMaxActivities(int start[], int finish[], int length) 
	{ 
		int i, j; 
		
		System.out.print("Following activities are selected : "); 

		i = 0; 
		System.out.print(i+" "); 

		for (j = 1; j < length; j++) 
		{ 
			if (start[j] >= finish[i]) 
			{ 
				System.out.print(j+" "); 
				i = j; 
			} 
		} 
	} 
	public static void main(String[] args) 
	{ 
		int start[] = {1, 3, 0, 5, 8, 5}; 
		int finish[] = {2, 4, 6, 7, 9, 9}; 
		int length = start.length; 
			
		printMaxActivities(start, finish, length); 
	} 
	
} 
