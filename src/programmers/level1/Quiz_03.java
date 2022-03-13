package programmers.level1;
import java.util.*;

public class Quiz_03 {

    public static void main(String[] args) {
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        System.out.println(solution(scoville, 7));


        System.out.println(solution3("  try hello world  "));
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
    /*
    프로그래머스 3 level - 동적 계획법 - N으로 표현
     */
    public static int solution2(int N, int number) {
        int answer = 0;
        List<Set<Integer>> list = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            Set<Integer> values = new HashSet<>();
            values.add(Integer.valueOf(String.valueOf(N).repeat(i)));
            list.add(values);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                for (Integer op1 : list.get(j)) {
                    for (Integer op2 : list.get(i - j - 1)) {
                        Set<Integer> temp =  list.get(i);
                        temp.add(op1 + op2);
                        temp.add(op1 - op2);
                        temp.add(op1 * op2);
                        if (op2 != 0) {
                            temp.add(op1 / op2);
                        }
                    }
                }
            }
            if (list.get(i).contains(number)) {
                answer = i + 1;
                break;
            }
            if (i == 7) {
                answer = -1;
            }
        }

        return answer;
    }
    /*
    프로그래머스 1Level - 이상한 문자 만들기
    */
    public static String solution3(String s) {
        List<String> result = new ArrayList<>();
        String[] words = s.split(" ", -1);
        for (String word : words) {
            StringBuffer strTemp = new StringBuffer();
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    strTemp.append(Character.toUpperCase(word.charAt(i)));
                } else {
                    strTemp.append(Character.toLowerCase(word.charAt(i)));
                }
            }
            result.add(strTemp.toString());
        }

        return String.join(" ", result);
    }
}
