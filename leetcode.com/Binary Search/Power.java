package BinarySearch;

public class Power 
{
	public double myPow(double x, int n) 
    {
         if(n == 0) 
             return 1.00;
         if(x == 0 || x == 1) 
             return x;
         if(n < 0)
         {
            x = 1/x;
         }
         return pow(x,n);      
    }
    
    public double pow(double x, int n)
    {        
        if(n == 0) 
        {
            return 1.0;
        }
        double half = pow(x,n/2);
        if(n % 2 == 0)
        {
            return half*half;
        }
        else
        {
            return half*half*x;
        }
    }
}
