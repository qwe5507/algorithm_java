package programmers.level1;


import java.util.*;

public interface Quiz_04 {

    public static void main(String[] args) {

        System.out.println(solution3(45));
    }

    /*
    TODO 프로그래머스 1level - 로또의 최고 순위와 최저 순위
     */
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int answer = 0;
        int cnt_0 = 0;

        for (int num : lottos) {
            for (int win_num : win_nums) {
                if (num == win_num) {
                    answer += 1;
                }
            }
            if (num == 0) {
                cnt_0 += 1;
            }
        }

        return new int[]{rank[answer + cnt_0], rank[answer]};
    }

    /*
    TODO 프로그래머스 1level - 예산
    */
    public static int solution2(int[] d, int budget) {

        Arrays.sort(d);

        int totalPrice = 0;
        int count = 0;
        for (int num : d) {
            totalPrice += num;
            if (totalPrice <= budget) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
    /*
    TODO 프로그래머스 1level - 3진법 뒤집기
    */
    public static int solution3(int n) {
        List<String> answer = new ArrayList<>();
        while (n != 0) {
            answer.add( String.valueOf(n % 3));
            n = n / 3;
        }

        int zisu = 0;
        int total = 0;
        for (int i = answer.size(); i-- > 0; ) {
            total += Integer.valueOf(answer.get(i)) * (Math.pow(3, zisu));
            zisu ++;
        }

        return total;
    }
}
