import java.util.*;
import java.lang.*;
import java.io.*;

// 요세푸스 문제
class Main {
    public static void main(String[] args) {

        System.out.println(solution(5,2));
    }

    public static int solution(int n, int k) {
            int answer = 0;
            ArrayDeque<Integer> queue = new ArrayDeque<>();

            for (int i =1 ; i<=n; i++){
                queue.addLast(i);
            }
            
            while (!queue.isEmpty()) {
                for (int i=1; i<k; i++){
                    int a = queue.pollFirst();
                    queue.addLast(a);
                }
                answer = queue.pollFirst();
            }
            
            return answer;
        }
}
