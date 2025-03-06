import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        // 초기화
        ArrayDeque<String> card1 = new ArrayDeque<>();
        ArrayDeque<String> card2 = new ArrayDeque<>();
        
        for (String i: cards1){
            card1.addLast(i);
        }
        for (String i:cards2) {
            card2.addLast(i);
        }

        for (String i : goal){
            if (!card1.isEmpty() && card1.peekFirst().equals(i)) {
                card1.pollFirst();
            }
            else if (!card2.isEmpty() && card2.peekFirst().equals(i)) {
                card2.pollFirst();
            }
            else {
                return "No";
            }
        }
        return answer;
    }
}