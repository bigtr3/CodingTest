import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] answer = {{1,2,3,4,5},
                          {2,1,2,3,2,4,2,5},
                          {3,3,1,1,2,2,4,4,5,5}};
        int[] score = new int[3];
        for (int i=0; i<answers.length; i++){
            for (int j=0; j<answer.length; j++){
                if (answers[i]==answer[j][i%answer[j].length])
                    score[j]++;
            }
        }
        
        
        int maxValue = Arrays.stream(score).max().getAsInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<score.length; i++){
            if (maxValue == score[i])
                list.add(i+1);
        }
        
        int[] result = list.stream().mapToInt(Integer::intValue).toArray(); 
        
        return result;
    }
}