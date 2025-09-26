import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] array = new int[a];
        for (int i=0; i<a; i++) {
            int temp = Integer.parseInt(br.readLine());
            array[i] = temp;
        }
        Arrays.sort(array);

        for (int i=0; i<a; i++) {
            System.out.println(array[i]);
        } 
    }   
}