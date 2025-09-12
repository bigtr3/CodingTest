import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T;
        T = sc.nextInt();
        for (int i=0; i<T; i++) {
            String P= "";
            String S;
            int R;
            R = sc.nextInt();
            S = sc.next();
            for (int j =0; j<S.length(); j++) {
                for (int k=0; k<R; k++) {
                    P += S.charAt(j);
                }
            }
            System.out.println(P);
        }
        
    }
}