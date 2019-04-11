package Arrays;

public class RotateImage 
{
	public void rotate(int[][] matrix) 
	{
        int n = matrix.length;
        int temp=0;
        // i = 0 to n/2
        for(int i=0; i<=(n/2)-1; i++) 
        {
            // j = i to n-i-2
            for(int j=i; j<=n-i-2; j++) 
            {
                // temp = matrix[j][n-i-1]
                temp = matrix[j][n-i-1];
                matrix[j][n-i-1] = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = temp;
            }
        }
    }
}
