package greedy;

public class LemonadeChange 
{
	public boolean lemonadeChange(int[] bills) 
    {
        int num5 = 0;
        int num10 = 0;
        
        for (int i = 0; i < bills.length; i++) 
        {
            int cur = bills[i];
            if (cur == 5) 
            {
                num5++;
            } else if (cur == 10) 
            {
                if (num5 < 1) 
                {
                    return false;
                }
                num5--;
                num10++;
            } else 
            {
                if (num10 > 0 && num5 > 0) 
                {
                    num10--;
                    num5--;
                } else if (num5 < 3) 
                {
                    return false;
                } else 
                {
                    num5-=3;
                }
            }
        }
        
        return true;
    }
}
