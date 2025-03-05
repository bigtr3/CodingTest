import java.util.*;
// add.(100-progresses[i]/speeds[i])
// 먼저 temp = poll
// while (!isEmpty()) 
// a =poll temp보다 a가 크면 answer++; 아니면 temp=a, add(answer)
// 
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> answer = new ArrayDeque<>();
        ArrayDeque<Integer> val = new ArrayDeque<>();
        
        for (int i=0; i<progresses.length; i++) {
            int a = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]); // 정수 나눗셈 문제 해결
            val.addLast(a);
        }
        
        int temp = val.pollFirst();
        int value = 1;
        while (!val.isEmpty()) {
            int b = val.pollFirst();
            if (b<=temp) {
                value++;
            }
            else {
                temp =b;
                answer.addLast(value);
                value = 1;
            }
        }
        answer.addLast(value);
        
        
        return answer.stream().mapToInt(i -> i).toArray();

    }
}