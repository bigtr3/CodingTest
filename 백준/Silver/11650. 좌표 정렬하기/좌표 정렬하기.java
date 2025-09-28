import java.util.*;
import java.io.*;

public class Main {
    static class Dot {
        int x;
        int y;
        Dot(int x, int y) {
            this.x =x;
            this.y=y;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Dot> dot = new ArrayList<>();
        for (int i=0; i<N; i++) {
            StringTokenizer tn = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tn.nextToken());
            int y = Integer.parseInt(tn.nextToken());
            dot.add(new Dot(x, y));
        }

        dot.sort(Comparator.comparingInt((Dot d) -> d.x).thenComparingInt(d-> d.y));

        for (Dot d : dot) {
            System.out.println(d.x+" "+d.y);
        }
    }
}