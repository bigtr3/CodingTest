import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            Stack<Character> stack = new Stack<Character>();
            String line = br.readLine();
            String answer ="YES";
            for (int j=0; j<line.length(); j++) {
                char a = line.charAt(j);
                if (a == '('){
                    stack.push(a);
                } else if (a==')' && stack.isEmpty()) {
                    answer = "NO";
                    break;
                } else if (a==')') {
                    stack.pop();
                }
               
            }
            if (stack.isEmpty() && answer == "YES"){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}