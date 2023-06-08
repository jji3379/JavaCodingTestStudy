package HashAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 학급 회장(해쉬)
 * 04-01
 */
public class Q01ClassPresident {
    public static char solution(int n, String value) {
        char answer = ' ';
        char[] charArr = value.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : charArr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = 0;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String value = kb.next();

        System.out.println(solution(n, value));
    }
}
