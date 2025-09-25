import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String temp = sc.next();
            list.add(temp);
        }

        list.stream()
            .distinct() // 완전 중복 제거
            .sorted(Comparator.comparingInt(String::length) // 길이 기준
                              .thenComparing(Comparator.naturalOrder())) // 사전순
            .forEach(System.out::println);
    }
}
