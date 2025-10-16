import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i=0; i<N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (map.containsKey(a)){
                int value = map.get(a)+1;
                map.put(a, value);
            } else {
                map.put(a,1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        for (int i=0; i<M; i++) {
            int a = Integer.parseInt(st2.nextToken());
            if (map.containsKey(a)){
                wr.write(map.get(a)+" ");
            } else {
                wr.write(0+" ");
            }
        }

        wr.flush();
    }
}