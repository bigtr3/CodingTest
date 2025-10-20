import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int i=0; i<N; i++) {
            String line = br.readLine();
            if (line.charAt(line.length()-1) < 'a') {
                StringTokenizer st = new StringTokenizer(line);
                String a = st.nextToken();
                int b =  Integer.parseInt(st.nextToken());
                stack.push(b);
            } else {
                switch (line) {
                case "pop": if (!stack.isEmpty()) { sb.append(stack.pop()+"\n"); break;} else {sb.append("-1\n"); break;} 
                case "size": sb.append(stack.size()+"\n"); break;
                case "empty": if (stack.isEmpty()) {sb.append("1\n"); break;} else {sb.append("0\n"); break;}
                case "top": if (!stack.isEmpty()) { sb.append(stack.peek()+"\n"); break;} else {sb.append("-1\n"); break;} 
                default : break;
                }
            }
        }
        System.out.println(sb);
    }
}