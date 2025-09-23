import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        double max = 0;
        double sum=0;
        double ave=0;
        for (int i=0;i<N; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i=0; i<N; i++) {
            sum = sum + (arr[i]/max*100);    
        }
        ave = sum/N;
              
        System.out.println(ave);
    }
}