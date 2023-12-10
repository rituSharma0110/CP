package com.company;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Problem1715B {
    static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) {
        int tc= scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int k = scanner.nextInt();
            int b = scanner.nextInt();
            long sum = scanner.nextLong();

            long val = (long)k * b;
            if (val > sum || sum-val>(long )(k-1)*length){
                out.println(-1);
            }else {
                long [] ans = new long[length];
                ans[0] = val;
                for (int i =0;i<length;i++){
                    long min = Math.min(sum-val, k-1);
                    ans[i]+=min;
                    out.print(ans[i] + " ");
                    sum-= min;
                }
                out.println();

            }
            out.flush();
        }
    }
}
