package quiz1;

public class Code1 {
    private static boolean solve(String a, String b) {
        // 구현 할 위치
        return true;
    }

    public static void main(String[] args) {

        System.out.println(solve("abc", "bca") == true);
        System.out.println(solve("abcd", "abcd" ) == true );
        System.out.println(solve("abcde", "abced" ) == false );

    }


}