// 1. 이름과 번호가 바뀌는 과정은 계산/저장할 필요가 없음 
// 2. 바로 삭제하는게 아니라 다른 스택에 저장해둬야함

import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        // init
        int[] up = new int[n+2];
        int[] down = new int[n+2];
        
        for (int i=0; i<n+2; i++){
            up[i] = i-1;
            down[i] = i+1;
        }
        
        Stack<Integer> del = new Stack<>();
        
        k++;
        
        // cmd 
        for ( String s : cmd) {
            if (s.startsWith("C")){
                del.push(k);
                up[down[k]] = up[k];
                down[up[k]] = down[k];
                k = n < down[k] ? up[k] : down[k];
            }
            else if (s.startsWith("Z")){
                int restore = del.pop();
                up[down[restore]] = restore;
                down[up[restore]] = restore;
            }
            else {
                String[] c = s.split(" ");
                int x = Integer.parseInt(c[1]);
                for (int i=0; i<x; i++) {
                    k = c[0].equals("U") ? up[k] : down[k];
                }
            }
        }
        
        char[] answer = new char[n];
        Arrays.fill(answer,'O');
        
        for (int i : del){
            answer[i-1] = 'X';
        }
        return new String(answer);
    }
}