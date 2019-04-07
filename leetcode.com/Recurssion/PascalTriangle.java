package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle 
{
	public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows;i++)
        {
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0;j<=i;j++)
            {
                row.add(Integer.valueOf(pascal(i,j)));
            }
            result.add(row);
        }
        return result;
    }
    private int pascal(int i, int j)
    {
        if(j==0)
        {
            return 1;
        }
        else if(j==i)
        {
            return 1;
        }
        else
        {
            return pascal(i-1,j-1)+pascal(i-1,j);
        }
    }
}
