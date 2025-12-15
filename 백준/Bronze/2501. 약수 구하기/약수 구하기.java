import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int K = Integer.parseInt(str.split(" ")[1]);

        int count =0;

        for (int i=1; i<=N; i++) {
            if (N%i == 0) {
                count++;
                if (count == K) {
                    System.out.print(i);
                    break;
                }
            }
        }

        if (K > count) {
            System.out.print(0);
        }
    }
}