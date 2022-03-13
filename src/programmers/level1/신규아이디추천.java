package programmers.level1;


/**
 * 프로그래머스 1레벨 - 신규아이디 추천
 */
public class 신규아이디추천 {

    public static void main(String[] args) {
        String returnStr = solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println("returnStr = " + returnStr);
    }

    public static String solution(String new_id) {
        String answer = "";
        //1단계
        String step1Str = new_id.toLowerCase();

        //2단계
        StringBuilder step2Str = new StringBuilder();
        for (char data : step1Str.toCharArray()) {
            if ((data > 97 && data < 122) || data == '!' && data != '@' && data != '#' && data != '*') {
                step2Str.append(data);
            }
        }

        //3단계


        return answer;
    }
}
