package quiz;

import java.util.Arrays;

public class Code6 {

      private static  int solution(int[] A, int[] B){
            int n = A.length;
            int m = B.length;
            Arrays.sort(A);
            Arrays.sort(B);

            int i=0;
            for ( int k=0 ; k < n ; k++) {
                if (i < m - 1   && B[i] < A[k]) {
                    i += 1;
                }
                if (A[k] == B[i]) {
                    return A[k];
                }else if(i < m - 1   && B[i] < A[k]){  k--;  }

            }
            return -1;
        }

    public static void main(String[] args) {
          int[] A = {1,5,3,4};
          int[] B = {2,3,6,4,7,8,9,1};
        System.out.println(solution(A,B));
    }
}
