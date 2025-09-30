import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] base = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            base[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(base);

        int M = Integer.parseInt(br.readLine());
        int[] target = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i=0; i<M; i++) {
            target[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i=0; i<M; i++) {
            int answer = (Arrays.binarySearch(base, target[i]) >=0 ? 1 : 0);
            System.out.println(answer);
        }
    }
}