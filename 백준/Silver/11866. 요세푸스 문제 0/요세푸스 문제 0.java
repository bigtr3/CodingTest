import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=1; i<=N; i++) {
            list.add(i);
        }

        int index = 0;
        sb.append("<");
        while (!list.isEmpty()) {   
            index = (index + K - 1) % list.size(); 
            if (list.size() == 1) {
                sb.append(list.get(index)+">");
            } else {
                sb.append(list.get(index)+", ");
            }
            list.remove(index);
        }

        System.out.print(sb);
    }
}