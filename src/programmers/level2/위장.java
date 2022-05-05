package programmers.level2;

import java.util.*;

public class 위장 {

    public static void main(String[] args) {
        String[][] input = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println("result = " + solution(input));
    }

    public static int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            Integer count = map.getOrDefault(clothe[1], 1);
            map.put(clothe[1], count + 1);
        }

        int sum = 1;
        for (Integer value : map.values()) {
            sum *= value;
        }

        return --sum;
    }
}
