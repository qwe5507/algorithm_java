package quiz;

public class Code2 {
    private static boolean checkPassword(String s) {
        if(s.length() < 5){
            return false;
        }
        if( !(s.matches(".*[0-9].*"))) {
            return false;
        }
        if( !(s.matches(".*[A-Z].*"))) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("8eqq") == false);
        System.out.println(checkPassword("password1") == false);
        System.out.println(checkPassword("Password1") == true);
    }
}
