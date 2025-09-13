import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count =0;
        for (int i=0; i<N; i++) {
            int  num = sc.nextInt();
            if (num < 2) {
                continue;
            }

            if (num == 2) {
                count++;
                continue;
            }
            for (int j=2; j<num; j++) {
                if (num % j == 0){
                    break;
                } else if (j==num-1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}