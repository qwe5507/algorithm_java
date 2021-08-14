package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code4 {
    public static int solution(int[] ints){
        // 코드 작성
        List<Integer> tempList = new ArrayList();
        for(int i = 0; i<ints.length ; i++){
            for (int j = i;j<ints.length;j++){
                if(ints[i] +  ints[j]==0){
                    tempList.add(ints[i]);
                }
            }
        }
        if(tempList.isEmpty()){
            return 0;
        }else {
            return Collections.max(tempList);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,2,-2,5,-3}) == 3);
        System.out.println(solution(new int[]{1,1,2,-1,2,-1}) == 1);
        System.out.println(solution(new int[]{1,2,3,-4}) == 0);
    }
}
