 
//Java Program to do a Breadth First Search/Traversal on a graph non-recursively
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
 
public class GraphBreadthFirstSearch 
{
    // Function to perform breadth first search
    static void bfs(int[][] matrix, int source)
    {
        boolean[] visited = new boolean[matrix.length];
        visited[source-1] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        System.out.println("The breadth first order is");
        while(!queue.isEmpty())
        {
            System.out.println(queue.peek());
            int x = queue.poll();
            int i;
            for(i=0; i<matrix.length;i++)
            {
                if(matrix[x-1][i] == 1 && visited[i] == false)
                {
                    queue.add(i+1);
                    visited[i] = true;
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
            {0,0,0},
            {1,0,1},
            {1,1,1},
        };

        int source=2;

        bfs(matrix,source);
    }
}