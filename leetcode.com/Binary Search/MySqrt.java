package BinarySearch;

public class MySqrt 
{
	public static int mySqrt(int x) 
	{
        if (x == 1)
            return 1;
        long start = 0;
        long end = x/2 + 1;
        while (start < end) 
        {
            long mid = start + (end - start) / 2;
            long t = mid * mid;
            if (t == x)
            {
            	return (int)mid;
            }
            if (t > x)
            {
            	end = mid;
            }
            else
            {
            	start = mid + 1;
            }
        }
        
        return (int)(start-1);
    }
	public static void main(String args[]) 
	{
		System.out.println(mySqrt(5));
	}
}
