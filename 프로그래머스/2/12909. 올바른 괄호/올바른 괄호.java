import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // (면 스택에 넣고 )가 나오면 스택에서 pop 근데 스택이 비었으면 false, 마지막에 스택이 비어있지 않아도 false
        
        // 스택 만들기
        Stack<Character> temp = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                temp.push('(');
            }
            else if (s.charAt(i) == ')' && !temp.isEmpty()) {
                temp.pop();
            }
            else {
                return false;
            }
        }
        
        if (temp.isEmpty() == false) {
            return false;
        }
        

        return answer;
    }
}