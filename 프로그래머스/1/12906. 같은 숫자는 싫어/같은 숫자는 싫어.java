import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answer = new Stack<>();
        // 스택? 넣고 peek해서 같으면 넣고 다르면 걍 지나감
        // 마지막에 mapToInt parseInt?? (map::Integer) 머드라
        answer.push(arr[0]); // 처음값은 넣은 채로 시작
        for (int i=1; i<arr.length; i++) {
            if (answer.peek() != arr[i]) {
                answer.push(arr[i]);
            }
        }

        return answer.stream()
             .mapToInt(Integer::intValue)
             .toArray();
        
        // 스택을 스트림으로 변환 후 하나하나의 원소를 기존 Integer 객체에서 int로 변환한 후 배열로 만듦
        // parseInt는 String의 수를 int로 바꿀 때 사용

    }
}