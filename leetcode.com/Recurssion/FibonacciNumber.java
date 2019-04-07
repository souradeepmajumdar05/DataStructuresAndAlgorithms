package Recursion;

public class FibonacciNumber 
{
	public  int fib(int N) 
    {
	    HashMap<Integer, Integer> tcache = new HashMap<Integer, Integer>();
	    return fibUtil(N,tcache);
	  }
   public  int fibUtil(int N,HashMap<Integer, Integer> tcache) 
    {
	    if (tcache.containsKey(N)) 
      {
	      return tcache.get(N);
	    }
	    int result;
	    if (N < 2) 
      {
	      result = N;
	    } 
      else 
      {
	      result = fib(N-1) + fib(N-2);
	    }
	    // keep the result in cache.
	    tcache.put(N, result);
	    return result;
	  }  
}
