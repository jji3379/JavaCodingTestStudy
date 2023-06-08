package HashAndTreeSet;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 아나그램
 * 04-02
 */
public class Q02Anagram {
    public static String solution(String str1, String str2) {
        String answer = "NO";
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean equals = Arrays.equals(charArray1, charArray2);

        if (equals) {
            answer = "YES";
        }

        return answer;
    }

    public static String solutionMap(String str1, String str2) {
        String answer = "YES";

        HashMap<Character, Integer> map1 = new HashMap<>();

        for (char char1 : str1.toCharArray()) {
            map1.put(char1, map1.getOrDefault(char1, 0) + 1);
        }

        for (char char2 : str2.toCharArray()) {
            if (!map1.containsKey(char2) || map1.get(char2) == 0) {
                return "NO";
            }
            map1.put(char2, map1.get(char2) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.println(solution(str1, str2));
    }
}
