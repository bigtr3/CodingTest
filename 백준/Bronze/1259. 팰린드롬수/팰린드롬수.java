import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            ArrayList<Integer> array = new ArrayList<>();
            String result = "yes";
            for (int i =0; a>0; i++) {
                array.add(a%10);
                a=a/10;
            }
            for (int i=0; i<array.size()/2; i++){
                if (array.get(i) == array.get(array.size()-i-1)) {
                    continue;
                } else {
                    result="no";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}