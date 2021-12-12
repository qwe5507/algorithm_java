package programmers;
import java.util.Collections;
import java.util.PriorityQueue;

public class Quiz_03 {

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        System.out.println(solution(scoville, 7));
    }

    /*
    프로그래머스 2Level - 힙 - 더 맵게
     */
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        //int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (Integer data : scoville) {
            priorityQueue.add(data);
        }

        while (true) {
            Integer min1 = priorityQueue.poll();
            if(min1 >= K) {
                break;
            } else if (priorityQueue.size() == 0) {
                answer = -1;
                break;
            }
            Integer min2 = priorityQueue.poll();
            Integer new_min = min1 + 2 * min2;
            priorityQueue.add(new_min);
            answer += 1;
        }

        return answer;
    }
}
