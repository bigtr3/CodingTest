import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = br.readLine();
        int count = 0;
        for (int i=0; i<N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (isPrime(a)) count++;
        }
        System.out.print(count);
    }

    static boolean isPrime(int a){
        if (a < 2) return false;
        for (int i=2; i<=Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            } 
        }
        return true;
    }
}