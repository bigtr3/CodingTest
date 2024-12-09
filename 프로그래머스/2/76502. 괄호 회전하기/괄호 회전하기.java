import java.util.*; 

class Solution {
    public int solution(String s) {
        HashMap<Character, Character> map = new HashMap<>();        
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        int n = s.length(); // 원래 길이 저장
        s += s;
        int answer = 0;
        
        A : for (int i =0; i<n; i++) {
            Stack<Character> stack = new Stack<>();
            for (int j=i; j<n+i; j++) {
                if (!map.containsKey(s.charAt(j))){
                    stack.push(s.charAt(j));
                }
                else {
                   if (stack.isEmpty() || !stack.pop().equals(map.get(s.charAt(j))))
                       continue A;
                }
                    
            }
            
            if (stack.isEmpty())
                answer++;
        }
        
        return answer;
    }
}