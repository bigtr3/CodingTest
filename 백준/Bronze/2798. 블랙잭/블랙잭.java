import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] black = new int[N];
        int result = 0;
        for (int i=0; i<N; i++) {
            black[i] = sc.nextInt();
        } 
        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    int temp = black[i]+black[j]+black[k];
                    if ( temp > result && temp <= M) {
                        result = temp;
                    }
                }
            }
        }
        System.out.println(result);
    }
}