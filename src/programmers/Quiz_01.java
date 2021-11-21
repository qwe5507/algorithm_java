package programmers;

import java.util.Arrays;
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
    /*
    프로그래머스 - 탐욕법 - 체육복
    */
    public long solution_03(int n, int[] lost, int[] reserve) {
        Integer u[] = new Integer[n + 2];
        Arrays.fill(u, 1);

        for (int i : reserve) {
            u[i] += 1;
        }
        for (int i : lost) {
            u[i] -= 1;
        }

        for (int i = 1; i < n + 1; i++) {
            if (u[i - 1] == 0 && u[i] == 2) {
                u[i - 1] += 1;
                u[i] -= 1;
            } else if (u[i + 1] == 0 && u[i] == 2) {
                u[i + 1] += 1;
                u[i] -= 1;
            }
        }
        int result = 0;
        for (int i = 1; i < n + 1; i++) {
            if (u[i] > 0) {
                result += 1;
            }
        }

        return result;
    }
}