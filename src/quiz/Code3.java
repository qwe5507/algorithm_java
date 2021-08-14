package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code3 {

    private static int check(int[] ints) {
        // 구현 할 위치
        int min = Arrays.stream(ints).min().getAsInt();
        int max = Arrays.stream(ints).max().getAsInt();

        List temp = new ArrayList<>();
        for(int i = min ; i <= max ; i++){
            temp.add(i);
        }
        int count = 0;
        for(int i =0;i<ints.length;i++){
            if(temp.contains(ints[i])){
                count++;
            }
        }
        return temp.size()-count;
    }

    public static void main(String[] args) {

        System.out.println(check(new int[]{1, 5, 3, 2}) == 1);  //[4]
        System.out.println(check(new int[]{1, 7}) == 5);  //[2,3,4,5,6]
        System.out.println(check(new int[]{1, 2}) == 0);  //[]
    }
}