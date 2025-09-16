import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int size[] = new int[6];
        for (int i =0; i<6; i++){
            size[i] = sc.nextInt();
        }
        int T = sc.nextInt();
        int P = sc.nextInt();
        int count=0;
        // 티셔츠
        for (int i =0; i<6; i++) {
            if (size[i] % T == 0) {
                count += size[i]/T;
            } else {
                count += size[i]/T+1;
            }
        }
        System.out.println(count);
        // 펜
        System.out.println(N/P+" "+N%P);

    }
}