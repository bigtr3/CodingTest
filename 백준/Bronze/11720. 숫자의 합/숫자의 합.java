import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a;
        int result=0;
        String b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.next();

        for (int i=0; i<a; i++) {
            result += b.charAt(i) - '0';
        }
        
        System.out.println(result);
    }
}