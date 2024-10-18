import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int ac =0;
        int bc =0;
        int cc=0;
        for (int i = 0; i<answers.length; i++){
            if (answers[i] == a[i%5])
                ac++;
            if (answers[i] == b[i%8])
                bc++;
            if (answers[i] == c[i%10])
                cc++;
        }
        
        HashSet<Integer> answer = new HashSet<>();
        
        if (ac > bc && ac>cc){
            answer.add(1);
        }
        else if (bc > ac && bc > cc){
            answer.add(2);
        }
        else if (cc > ac && cc > bc){
            answer.add(3);
        }
        else if (bc == ac && bc > cc){
            answer.add(1);
            answer.add(2);
        }
        else if (cc == ac && ac > bc){
            answer.add(1);
            answer.add(3);
        }
        else if (bc == cc && bc > ac){
            answer.add(2);
            answer.add(3);
        }
        else if (bc == ac && bc == cc){
            answer.add(1);
            answer.add(2);
            answer.add(3);
        }
        
        int[] answera = answer.stream().mapToInt(Integer::intValue).toArray();
        
        return answera;
    }
}