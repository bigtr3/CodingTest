import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        // n = moves[i]
        // j=0 부터 board.length까지 board[j][n] > 0 인 수를 꺼내서 (다 0이면 아무일도 x)
        // !stack.isEmpty() && board[j][n].equals(stack.peek()) -> pop, count+=2
        // else -> stack에 넣음
        // board[j][n] = 0;
        Stack<Integer> stack = new Stack<>();
        A:for (int i =0; i<moves.length; i++) {
            int n = moves[i]-1;
            for (int j = 0; j<board.length; j++) {
                int num = board[j][n];
                if (num > 0) {
                    if (!stack.isEmpty() && (num==stack.peek())) {
                        stack.pop();
                        answer = answer + 2;
                    }
                    else {
                        stack.push(num);
                    }
                    board[j][n] = 0;
                    continue A;
                }
            }
        }
        return answer;
    }
}