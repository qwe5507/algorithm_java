package programmers.level1;


public interface Quiz_04 {

    public static void main(String[] args) {

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
}
