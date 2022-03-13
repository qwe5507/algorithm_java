package programmers.level1;

/*
프로그래머스 - 같은 숫자는 싫어 [자바 풀이]
 */

import java.util.ArrayList;

public class Quiz {
    public static class Solution {
        public int[] solution(int []arr) {
            ArrayList<Integer> list = new ArrayList();
            int saveNum = -1;

            for (int i=0; i<arr.length; i++) {
                if (saveNum != arr[i]) {
                    saveNum=arr[i];
                    list.add(arr[i]);
                }
            }
            int[] answer = new int[list.size()];

            for (int i=0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
