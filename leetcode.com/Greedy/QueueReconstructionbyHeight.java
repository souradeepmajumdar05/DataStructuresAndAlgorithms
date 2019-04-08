package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionbyHeight 
{
	public int[][] reconstructQueue(int[][] people) 
	{
        Arrays.sort(people,new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b){
                if(a[0]==b[0])
                    return a[1]-b[1];
                return b[0]-a[0];
            }
        });
        
        List<int[]> res = new ArrayList<>();
        for(int[] tmp : people)
        {
            res.add(tmp[1],tmp);
        }
        
        return res.toArray(new int[people.length][]);
    }
}
