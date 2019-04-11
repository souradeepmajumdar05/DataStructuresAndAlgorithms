package Arrays;

public class PlusOne 
{
	public int[] plusOne(int[] digits) 
    {
        //
        int temp;
        for(int i=digits.length-1 ; i>=0 ; i--)
        {
            temp = digits[i]+1;
            if (!(temp >=0 && temp <= 9))
            {
                int rem= temp%10;
                int aftdiv = temp/10;
                if(i>0)
                {
                    digits[i]=digits[i]+rem;
                    digits[i-1]=digits[i]+aftdiv;
                }
                else
                {
                    digits[i]=temp;
                }
            }
            else
            {
                digits[i]=digits[i]+1;
            }
        }
        return digits;
    }
}
