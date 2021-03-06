package temp;

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] arr_A = br.readLine().split(" ");
        for(int i_A = 0; i_A < N; i_A++) {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }
        int out_ = Solve(N, A);
        System.out.println(out_);

         wr.close();
         br.close();
    }
    static int Solve(int N, int[] A){
        if (N == 0) return 0;
        if (N > 0 && A.length == 1) return A[0];
        Arrays.sort(A);
        int closestToZero = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i< A.length; i++) {
            int abs = Math.abs(A[i]);
            System.out.println(abs + ":" + diff);
            if (abs < diff) {
                closestToZero = i;
                diff = abs;
            } else if (abs == diff && A[i] > 0 && A[closestToZero] < 0) {
                //same distance to zero but positive 
                closestToZero = i;
            }
        }
        return A[closestToZero];
    }
}
