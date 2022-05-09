package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class 소수만들기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,7,6,4}));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int z = j + 1; z < nums.length; z++) {
                    boolean flag = false;
                    int sum = nums[i] + nums[j] + nums[z];

                    for (int h = 2; h < sum-1; h++) {
                        if (sum % h == 0) {
                            flag = true;
                        }
                    }

                    if (!flag) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
