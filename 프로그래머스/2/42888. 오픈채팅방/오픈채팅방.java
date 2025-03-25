import java.util.*;

// 1. uid가 key 이름이 값
// 2. 들어왔습니다, 나갔습니다도 해시맵으로 저장
// 3. record를 " "로 쪼개고 크기가 3이면 change나 enter임으로 uid와 닉네임을 저장 (바뀜)
// 4. record를 " "로 쪼개고 인덱스 1은 uid 해시맵에서 값 가져오고 0은 2의 해시맵과 매칭

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> uid = new HashMap<>();
        HashMap<String, String> endM = new HashMap<>();
        endM.put("Enter" , "님이 들어왔습니다.");
        endM.put("Leave" , "님이 나갔습니다.");
        
        for (String a : record) {
            String[] temp = a.split(" ");
            if (temp.length == 3) {
                uid.put(temp[1], temp[2]);
            }
        }
        
        ArrayList<String> answer = new ArrayList<>();
        for (String a : record) {
            String[] temp = a.split(" ");
            if (endM.containsKey(temp[0])) {
                answer.add(uid.get(temp[1])+endM.get(temp[0]));
            }
        }

        return answer.toArray(new String[0]);
    }
}