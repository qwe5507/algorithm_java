package programmers.level2;

import java.util.*;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> prefix = new HashMap();

        for (String phone : phone_book) {
            prefix.put(phone, 1);
        }

        for (String phone : phone_book) {
            String keyword = "";
            for (char key : phone.toCharArray()) {
                keyword += key;
                if(prefix.containsKey(keyword) && !(phone.equals(keyword))) {
                    return false;
                }
            }
        }

        return true;
    }
}
