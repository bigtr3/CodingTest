import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] answer = {{1,2,3,4,5},
                          {2,1,2,3,2,4,2,5},
                          {3,3,1,1,2,2,4,4,5,5}};
        
        int[] solution = {0,0,0};
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i<answers.length; i++) {
            if (answers[i] == answer[0][i%5]) {
                solution[0]++;
            }
            if (answers[i] == answer[1][i%8]) {
                solution[1]++;
            }
            if (answers[i] == answer[2][i%10]) {
                solution[2]++;
            }
        }
        
        int maxValue = Arrays.stream(solution).max().getAsInt();
        for (int i =0; i<3; i++) {
            if (solution[i] == maxValue) {
                list.add(i+1);
            }
        }
        
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}