import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = str.length();
        int[] array = new int[N];
        for (int i=0; i<N; i++) {
            array[i] = str.charAt(i)-'0';
        }

        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for (int i = N-1; i>=0; i--) {
            sb.append(array[i]);
        }
        System.out.println(sb);
    }
}