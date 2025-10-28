import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[][] num = new int[15][15];
        for (int i=1; i<15; i++) {
            num[i-1][1] = 1;
            num[0][i] = i;
        }

        for (int j=1; j<15; j++) {
            for (int k=1; k<15; k++) {
            num[j][k] = num[j][k-1] + num[j-1][k];         
            }
        }
        for (int i=0; i<T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            
            sb.append(num[K][N]+"\n");
        }
        System.out.print(sb);
    }
}