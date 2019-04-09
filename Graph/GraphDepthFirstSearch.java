import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
public class GraphDepthFirstSearch 
{
    // Function to perform depth first search
    static void dfs(int[][] matrix, int source)
    {
        boolean[] visited = new boolean[matrix.length];
        visited[source-1] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        int i,x;
        System.out.println("The depth first order is");
        System.out.println(source);
        while(!stack.isEmpty())
        {
            x = stack.pop();
            for(i=0; i<matrix.length; i++)
            {
                if(matrix[x-1][i] == 1 && visited[i] == false)
                {
                    stack.push(x);
                    visited[i] = true;
                    System.out.println(i+1);
                    x = i+1;
                    i = -1;
                }
            }
        }
    }
    // Function to read user input
    public static void main(String[] args) 
    {
        int vertices;

        //this is a adjacency matrix
        int[][] matrix = new int[][]{
            {1,1,1,1},
            {1,0,0,0},
            {1,1,1,0},
            {0,0,0,1},
        };

        int source=2;

        dfs(matrix,source);
    }
}