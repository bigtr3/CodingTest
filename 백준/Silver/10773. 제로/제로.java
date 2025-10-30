import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        int result =0;
        for (int i=0; i<K; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                stack.pop();    
            } else {
                stack.push(a);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);
    }
}