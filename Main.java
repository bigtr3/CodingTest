import java.util.*;

// 문제 02 배열 제어하기
// 정수 배열을 하나 받아 배열의 중복값을 제거하고 배열 데이터를 내림차순으로 정렬해서 반환하는 solution() 함수를 구현하세요

class Solution {
    public static int[] solution(int[] arr) {
        Integer[] answer = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(answer, Collections.reverseOrder());

        
        return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
    }
}

public class Main {
    public static void main(String[] ars) {
        int[] arr1 = {4,2,2,1,3,4};
        int[] arr2 = {2,1,1,3,2,5,4};
        System.out.println(Arrays.toString(Solution.solution(arr1)));
        System.out.println(Arrays.toString(Solution.solution(arr2)));

    }
}

/*
1. Arrays.stream(arr)
arr 배열을 스트림으로 변환합니다.
스트림(Stream)은 데이터의 흐름을 처리하는 기능을 제공합니다. 여기서는 배열을 스트림으로 변환하여 이후에 데이터를 필터링하거나 변환할 수 있습니다.
2. .boxed()
기본형 배열인 int[]을 Integer[]로 변환합니다.
자바에서는 int와 같은 기본형 타입을 객체로 감싼 클래스인 Integer로 변환해야 Collections의 메소드를 사용할 수 있습니다. 이 과정은 박싱(Boxing)이라고 부릅니다.
3. .distinct()
배열의 중복 요소를 제거합니다.
스트림에서 중복되는 값을 자동으로 필터링하여 고유한 값들만 남깁니다.
4. .toArray(Integer[]::new)
스트림을 다시 배열로 변환합니다.
이 부분에서 최종적으로 Integer[] 타입의 배열이 생성됩니다.
5. Arrays.sort(answer, Collections.reverseOrder())
중복을 제거한 배열을 내림차순으로 정렬합니다.
Collections.reverseOrder()는 내림차순 정렬을 지정하는 Comparator를 반환합니다.
6. Arrays.stream(answer)
Integer[] 배열을 다시 스트림으로 변환합니다.
7. .mapToInt(Integer::intValue)
Integer[] 배열을 다시 기본형 int[] 배열로 변환합니다.
언박싱(Unboxing): Integer 객체를 다시 int로 변환하는 과정입니다.
8. .toArray()
스트림을 int[] 배열로 변환하여 최종 결과를 반환합니다.
 */