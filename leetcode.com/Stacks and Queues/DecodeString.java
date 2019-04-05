package sq;

import java.util.*;

public class DecodeString 
{
	public static String decodeString(String s) 
    {
        Stack<Integer> count = new Stack<>();
        Stack<String> str = new Stack<>();
        int i = 0;
        str.push("");
        while(i < s.length()) 
        {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') 
            {
                int start = i;
                while (s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9') 
                {
                    i++;
                }
                count.push(Integer.parseInt(s.substring(start, i + 1)));
            }
            else if (s.charAt(i) == '[') 
            {
                str.push("");
            }
            else if (s.charAt(i) == ']') 
            {
                String st = str.pop();
                StringBuilder sb = new StringBuilder();
                int n = count.pop();

                for (int j = 0; j < n; j++) 
                {
                    sb.append(st);
                }

                str.push(str.pop() + sb.toString());
            }
            else 
            {
                str.push(str.pop() + s.charAt(i));
            }
            i++;
        }
        return str.pop();    
    }
	public static void main(String args[])
	{
		System.out.println(decodeString("3[a]2[bc]"));
		System.out.println(decodeString("3[a2[c]]"));
		System.out.println(decodeString("2[abc]3[cd]ef"));
	}
}
