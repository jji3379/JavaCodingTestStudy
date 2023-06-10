package HashAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 모든 아나그램 찾기
 * 04-04
 */
public class Q04FindAllAnagrams {
    public static int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> stringMap = new HashMap<>(); // main Map
        HashMap<Character, Integer> tMap = new HashMap<>(); // 주어진 Map

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        // 주어진 비교 문자
        for (int i = 0; i < tCharArray.length; i++) {
            tMap.put(tCharArray[i], tMap.getOrDefault(tCharArray[i], 0) + 1);
        }

        // 메인 초기 윈도우 생성
        for (int i = 0; i < tCharArray.length - 1; i++) {
            stringMap.put(sCharArray[i], stringMap.getOrDefault(sCharArray[i], 0) + 1);
        }

        // 메인과 비교
        int lt = 0;
        for (int rt = tCharArray.length - 1; rt < sCharArray.length; rt++) {
            // 1. rt 값 하나 추가
            stringMap.put(sCharArray[rt], stringMap.getOrDefault(sCharArray[rt], 0) + 1);
            // 2. 같은지 비교
            if (stringMap.equals(tMap)) {
                answer++;
            }
            // 3. 값 하나 -
            stringMap.put(sCharArray[lt], stringMap.get(sCharArray[lt]) - 1);

            // 4. 0 이면 lt 제거
            if (stringMap.get(sCharArray[lt]) == 0) {
                stringMap.remove(sCharArray[lt]);
            }

            // 5. lt 증가
            lt++;
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();

        System.out.println(solution(s, t));
    }
}
