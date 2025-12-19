import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            int count =0;
            for (int j=N; j>0; j = j/2) {
                if (j%2 == 1) {
                    sb.append(count+" ");
                }
                count++;
            }
            System.out.println(sb);
        }
    }
}