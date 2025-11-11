import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count =0;
        int i = 666;
        while (true) {
            String temp = Integer.toString(i);
            if (temp.contains("666")) {
                count++;
            }

            if (count == N){
                System.out.print(i);
                break;
            }
            i++;
        }     
    }
}