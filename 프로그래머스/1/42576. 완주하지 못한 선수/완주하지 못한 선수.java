import java.util.*;

// 해시셋?? 다 넣은담에 for 문으로 remove하고 남은거 return -> x
// 해시맵에 완주자 이름과 몇명인지를 저장하고, 참가자를 순회하며 해시맵의 해당 이름의 키가 0이면 완주 못한사람, 0이 아니면 완주한 사람이니까 -1
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hash = new HashMap<>();
        for (String i : completion) {
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }
        
        for (String i : participant) {
            if (hash.getOrDefault(i, 0) == 0) {
                return i;
            }
            hash.put(i, hash.get(i) - 1);
        }
        
        return null;
    }
}