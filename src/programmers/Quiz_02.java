package programmers;

import java.util.*;

public class Quiz_02 {
    public static void main(String[] args) {
//        int[] list = {3, 30, 34, 5, 9};
//        System.out.println(solution(list));

        System.out.println(solution2("1924", 2));
    }

    /*
    프로그래머스 2레벨 - 가장 큰 수
     */
    public static String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        for (int number: numbers) {
            list.add(String.valueOf(number));
        }

        list.sort((a,b) -> {
//            Integer aNum = Integer.valueOf(a.repeat(4).substring(0, 4));
//            Integer bNum = Integer.valueOf(b.repeat(4).substring(0, 4));
//            return bNum.compareTo(aNum);
            // 파이썬과 다르게 하나의 인자로 비교하는게 아니여서 아래와 같이 a + b, b + a로 비교할 수있는것 같다.
            // 대부분의 사람들은 아래와 같이 풀이
            // java의 compareTo 가 파이썬과 문자인 숫자 비교와 동일하게 첫글자 부터 비교하며 같다면 다음 글자를 비교한 후
            // 그 문자의 아스키코드 값의 차를 리턴한다.
            String aStr = String.valueOf(a);
            String bStr = String.valueOf(b);
            return (bStr + aStr).compareTo(aStr + bStr);
        });
        StringBuilder answer = new StringBuilder("");
        if (list.get(0).equals("0")) {
            answer.append("0");
        } else {
            for (String data : list) {
                answer.append(data);
            }
        }
        return answer.toString();
    }
    /*
    프로그래머스 2레벨 - 큰 수 만들기
     */
    public static String solution2(String number, int k) {
        StringBuilder answer = new StringBuilder("");
//        char[] result = new char[number.length() - k];
        Stack<Character> stackChar = new Stack<>();
        for (int i = 0; i < number.length(); i++) {
            while (!stackChar.isEmpty() && stackChar.peek() < number.charAt(i) && k > 0) {
                stackChar.pop();
                k -= 1;
            }
            if (k == 0) {
                for (int j = i; j < number.length(); j++) {
                    stackChar.push(number.charAt(j));
                }
                break;
            }
            stackChar.push(number.charAt(i));
        }
        while (k > 0) {
            stackChar.pop();
            k -= 1;
        }
        Stack<Character> tempStack = new Stack<>();
        while (!stackChar.isEmpty()) {
            tempStack.push(stackChar.pop());
        }
        while (!tempStack.isEmpty()) {
            answer.append(tempStack.pop());
        }

        return answer.toString();
    }
}