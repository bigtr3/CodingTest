import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i: numbers){
            list.add(String.valueOf(i));
        }
        
        Collections.sort(list, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        String answer = "";        
        for (String i : list){
            answer+=i;
        }
        
        if (answer.charAt(0) == '0'){
            answer = "0";
        }
        return answer;
    }
}