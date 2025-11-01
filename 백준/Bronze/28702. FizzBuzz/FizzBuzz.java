import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<3; i++) {
            String temp = br.readLine();
            if (temp.equals("FizzBuzz") || temp.equals("Fizz") || temp.equals("Buzz")) {
                
            } else {
                int num = Integer.parseInt(temp) + 3 - i;
                if (num % 5 == 0 && num % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else if (num % 5 == 0) {
                    System.out.println("Buzz");
                } else if (num % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(num);
                }
                break;
            }
        }
    }
}