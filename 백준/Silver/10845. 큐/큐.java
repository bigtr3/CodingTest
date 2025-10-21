import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i=0; i<N; i++) {
            String a = br.readLine();
            if (a.startsWith("push")) {
                int b = Integer.parseInt(a.split(" ")[1]);
                queue.offer(b);
            } else {
                switch (a) {
                    case "pop": sb.append(queue.isEmpty() ? "-1\n" : queue.poll()+"\n"); break;
                    case "size": sb.append(queue.size()+"\n"); break;
                    case "empty": sb.append(queue.isEmpty() ? "1\n" : "0\n"); break;
                    case "front": sb.append(queue.isEmpty() ? "-1\n" : queue.peekFirst()+"\n"); break;
                    case "back": sb.append(queue.isEmpty() ? "-1\n" : queue.peekLast()+"\n"); break;
                }
            }
        }
        System.out.print(sb);
    }
}