import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern = {{1,2,3,4,5},
                           {2,1,2,3,2,4,2,5},
                           {3,3,1,1,2,2,4,4,5,5}};
        
        int[] answer = {0,0,0};
        for (int i = 0; i<answers.length; i++){
            for (int j = 0; j<pattern.length; j++){
                if (answers[i] == pattern[j][i % pattern[j].length]){
                    answer[j]++;
                }
            }
        }
        int maxValue = Arrays.stream(answer).max().getAsInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<answer.length; i++){
            if (answer[i] == maxValue){
                list.add(i+1);
            }
        }
        
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        
        return result;
    }
}
