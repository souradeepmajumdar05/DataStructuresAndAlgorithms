package BinarySearch;

public class ValidPerfectSquare 
{

    public static boolean isPerfectSquare(int num) 
    {
        int low = 1, high = num;
        while (low <= high) 
        {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) 
            {
                return true;
            } 
            else if (mid * mid < num) 
            {
                low = (int) mid + 1;
            } 
            else 
            {
                high = (int) mid - 1;
            }
        }
        return false;
    }
	public static void main(String[] args) 
	{
		System.out.println(isPerfectSquare(3));

	}

}
