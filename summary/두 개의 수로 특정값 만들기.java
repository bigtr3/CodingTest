import java.util.*;
import java.lang.*;
import java.io.*;

// 두 개의 수로 특정값 만들기
// n개의 양의 정수로 이루어진 배열 arr와 정수 target이 주어졌을 때 이 중에서 합이 target인 두 수가 arr에 있는지 찾고, 있으면 true
// 키를 targer-value로 한다음에 for문 돌면서 constrainKey(i) 확인..??

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8};
        System.out.println(solution(arr, 6));
    }

	public static boolean solution(int[] arr, int target) {
        boolean answer = false;
		// 해시셋은 키만 저장
        HashSet<Integer> hash = new HashSet<>();
        
		for (int i : arr) {
			if (hash.contains(target-i)){
				return true;
			}
			hash.add(i);
		}
     
        return answer;
    }
    
}