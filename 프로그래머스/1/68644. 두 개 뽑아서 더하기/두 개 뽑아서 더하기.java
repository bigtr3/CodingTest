import java.util.*;

// set don't allow duplicate value
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i =0; i<numbers.length-1; i++){
            for (int j =i+1; j<numbers.length; j++){
                int val = numbers[i] + numbers[j];
                set.add(val);
            }
        }
        
        
// Integer[] temp = Arrays.stream(answer).boxed().distinct().toArray(Integer[]::new);
        
// return Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}