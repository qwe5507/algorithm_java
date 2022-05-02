package programmers.kakao;

/**
 * 2018 KAKAO BLIND RECRUITMENT - [1차] 비밀지도
 */
public class 비밀지도 {
    public static void main(String[] args) {
        String[] result = solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});
        for (String s : result) {
            System.out.println("s = " + s);
        }
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int num = arr1[i] | arr2[i];
            answer[i] = String.format("%"+ n +"s", Integer.toBinaryString(num).replace("1", "#").replace("0", " "));
        }
        return answer;
    }
}
