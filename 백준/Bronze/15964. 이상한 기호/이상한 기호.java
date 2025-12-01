import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int a = Integer.parseInt(temp.split(" ")[0]);
        int b = Integer.parseInt(temp.split(" ")[1]);

        System.out.println(cal(a,b));
    }

    static int cal(int a, int b) {
        int result =0;
        result = (a+b) * (a-b);
        return result;
    }
}