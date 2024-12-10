import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        // O(n^2)
        // prices[i]가 prices[j]보다 같거나 클때까지 answer[i]++;
        // for (int i=0; i<len; i++) {
        //     for (int j=i+1; j<len; j++) {
        //         if (prices[i]<=prices[j])
        //             answer[i]++;
        //     }
        // }
        
        
        // 스택이 비어있지 않고, 스택의 젤 위의 값보다 prices[i]가 작으면 pop해서 인덱스를 가져온 후 answer[i] = pop-i; 로 길이 구함
        // 스택에 인덱스를 넣음
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 처음 값은 무조건 넣음
        
        for (int i=1; i<len; i++){
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int j = stack.pop();
                answer[j] = i-j;
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = len-j-1;
        }
        
        return answer;
    }
}