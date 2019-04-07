package BinarySearch;

public class FindMinimuminRotatedSortedArray 
{
	public int findMin(int[] nums) 
    {
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++) 
        {
            if(i==0) 
            {
                min = nums[i];
            } 
            else if(min > nums[i])
            {
                return nums[i];    
            }
        }
        return min;  
    }
}
