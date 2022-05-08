package programmers.level2;

import java.util.*;

public class 기능개발 {

    public int[] solution1(int[] progresses, int[] speeds) {
        int[] day0fend = new int[100];
        int day = 0;

        for (int i = 0; i < progresses.length; i++) {
            while (100 > progresses[i] + day * speeds[i]) {
                day++;
            }

            day0fend[day]++;
        }

        return Arrays.stream(day0fend).filter(i -> i > 0).toArray();
    }
    /*
        TODO 큐를 이용해서 다시 풀어보자.
     */

    public int[] solution2(int[] progresses, int[] speeds) {
        return null;
    }
}
