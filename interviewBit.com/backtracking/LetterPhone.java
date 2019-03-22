package test;

import java.util.*;

public class LetterPhone 
{
	public static ArrayList<String> letterCombinations(String A) 
    {
        HashMap<Integer,String> map= new HashMap<Integer,String>();
        map.put(0,"0");
        map.put(1,"1");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        ArrayList<String> ans = new ArrayList<String>();
        letterCombinationsUtil(A,map,ans,new StringBuilder(),0);
        for(int i=0; i <ans.size();i++)
        {
        	System.out.println(ans.get(i));
        }
        return ans;
    }
    public static void letterCombinationsUtil(String A,HashMap<Integer,String> map,ArrayList<String> ans,StringBuilder temp, int start)
    {
        if(A.length()==temp.length())
        {
            ans.add(temp.toString());
            return;
        }
        if(start>=A.length())
        {
        	return ;
        }

        //String text=map.get((int)A.charAt(start));
        String text=map.get(Character.getNumericValue(A.charAt(start)));
        for(int i=0;i<text.length();i++)
        {
            temp.append(text.charAt(i));
            letterCombinationsUtil(A,map,ans,temp,start+1);
            //System.out.println("Before : "+temp.toString());
            temp.deleteCharAt( temp.length()-1);
            //System.out.println("After : "+temp.toString());
        }
    }
    public static void main(String args[])
   	{
    	letterCombinations("2");
   	}

}
