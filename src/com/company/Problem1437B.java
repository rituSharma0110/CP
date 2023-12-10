package com.company;
import java.util.*;

public class Problem1437B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            String string = scanner.next();
            int cntZero =0;
            int cntOne =0;
            for (int i=0;i<n-1;i++){
                if (string.charAt(i)=='0' && string.charAt(i)==string.charAt(i+1)){
                    cntZero++;
                }else if (string.charAt(i)=='1' && string.charAt(i)==string.charAt(i+1)){
                    cntOne++;
                }
            }
            int ans = Math.max(cntOne,cntZero);
            System.out.println(ans);
        }
    }
}
