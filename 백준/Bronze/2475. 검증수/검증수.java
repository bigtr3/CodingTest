import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;
        for (int i=0; i<5; i++) {
            result += multi(i, str);
        }

        System.out.println(result%10);
    }

    static int multi(int i, String str) {
        int a = Integer.parseInt(str.split(" ")[i]);
        return a*a;
    }
}