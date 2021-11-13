package programmers;

import java.util.HashMap;
import java.util.Map;

public class Quiz_01 {
    public static void main(String[] args) {

    }

    /*
    프로그래머스 - 완주하지 못한 선수
     */
    public String solution_01(String[] participant, String[] completion) {
        Map<String, Integer> temp = new HashMap<>();

        for (String name : participant) {
            temp.put(name, temp.getOrDefault(name, 0) + 1); // getOrDefault()가 있다니..!
        }

        for (String name : completion) {
            temp.put(name, temp.get(name) - 1);
        }

        String result = "";
        for (String name : temp.keySet()) {
            if (temp.get(name) > 0) {
                result = name;
            }
        }
        return result;
    }

    /*
    프로그래머스 - 두 정수 사이의 합
    */
    public long solution_02(int a, int b) {
        long answer = 0;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}