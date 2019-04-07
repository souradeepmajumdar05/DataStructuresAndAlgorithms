package BinarySearch;

public class BinarySearch 
{
	public static int search(int[] nums, int target) {
        return searchImpl(nums, target, 0, nums.length-1);
    }
    
    public static int searchImpl(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        
        int mid = (start + end)/2;
        
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] > target) {
            return searchImpl(nums, target, start, mid-1);
        }
        else {
            return searchImpl(nums, target, mid+1, end);
        }
    }

	public static void main(String args[]) 
	{
		int[] myIntArray = {1, 2, 3};
		System.out.println(search(myIntArray,3));
	}
}
