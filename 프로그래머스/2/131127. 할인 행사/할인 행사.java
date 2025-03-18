import java.util.*;

// 일단 hashmap에 키를 제품이름, 값을 수량으로 저장 -> O(n)
// 제품을 해시맵으로 만들어.. -> O(n^2)??
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wants = new HashMap<>();
        
        for (int i=0; i<want.length; i++) {
            wants.put(want[i], number[i]);
        }
        
        for (int i=0; i<discount.length-9; i++) {
            
            HashMap<String, Integer> day = new HashMap<>();
            
            for (int j=i; j<10+i; j++){
                if (wants.containsKey(discount[j])) {
                    day.put(discount[j], day.getOrDefault(discount[j], 0) + 1);
                }
            }
            
            if (wants.equals(day)) {
                answer++;
            }

        }
        
        return answer;
    }
}