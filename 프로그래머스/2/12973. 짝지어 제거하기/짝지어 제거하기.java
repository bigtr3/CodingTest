import java.util.*;


class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            // 스택이 비어있으면 push, 
            if (stack.isEmpty())
                stack.push(c);
            // 아니면 peek해서 다음꺼랑 같은지 확인같으면 팝, 다르면 push
            else {
                if (stack.peek().equals(c))
                    stack.pop();
                else {
                    stack.push(c);
                }
            }

        }
        // 스택이 비어있으면 1
       if (stack.isEmpty())
           answer = 1;

        return answer;
    }
}