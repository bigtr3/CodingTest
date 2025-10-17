import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = 1;
        int temp = 1;
        for (int i=N; i>N-K; i--) {
            result *= i;
        }

        for (int i=K; i>0; i--) {
            temp *= i;
        }

        result = result / temp;

        bw.write(result+"");
        bw.flush();
    }
}