package sq;

import java.util.Stack;

public class ValidParentheses 
{
	public static boolean isValid(String s) 
    {
        if(null == s || s.length() == 0 )
        {
            return true;
        }

        if((s.length() % 2) != 0)
        {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            switch(c)
            {
                case '(':
                    stack.add(')');
                    break;
                case '{':
                    stack.add('}');
                    break;
                case '[':
                    stack.add(']');
                    break;
                case ')':
                case '}':
                case ']':
                    if(stack.isEmpty() || c != stack.pop())
                    {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }
	public static void main(String args[])
	{
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}"));
	}
}
