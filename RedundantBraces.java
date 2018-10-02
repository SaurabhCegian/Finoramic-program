public class Solution 
{
    public int braces(String A) 
    {
        Stack <Character> stk = new Stack<Character> ();
        int k =0;
        while(k < A.length())
        {
            char c = A.charAt(k);
            if(c =='(' || c == '+' || c == '-' || c == '*' || c == '/')
                stk.push(c);
            else if(c == ')')
            {
                if(stk.peek() =='(')
                    return 1;
                else
                {
                    while(!stk.isEmpty() && stk.peek() != '(')
                        stk.pop();
                    stk.pop();
                }
            }
            k++;
        }
        return 0;
    }
}
