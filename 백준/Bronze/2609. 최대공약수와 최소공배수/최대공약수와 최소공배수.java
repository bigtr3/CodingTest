import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min=a*b, max=0, big=0, small=0;
        if (a>b) {
            big = a;
            small =b;
        } else {
            big =b;
            small =a;
        }
        for (int i=1; i<=small; i++) {
            if (a%i==0 && b%i==0 && max < i) {
                max=i;
            }
        }
        for (int i=a*b; i>=big; i--) {
            if (i%a==0 && i%b==0 && min > i) {
                min=i;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}