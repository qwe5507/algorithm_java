package quiz1;

public class Code1 {
    private static boolean solve(String a, String b) {
        String temp = a;
        for(int i = 0; i <a.length(); i++){
            temp = temp.substring(1) + temp.substring(0,1);
            if(temp.equals(b)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(solve("abc", "bca") == true);
        System.out.println(solve("abcd", "abcd" ) == true );
        System.out.println(solve("abcde", "abced" ) == false );

    }


}