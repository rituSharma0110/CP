package com.company;
import java.util.*;

public class Problem1658B {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        int m = 998244353;
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            if(n%2!=0) {
                System.out.println(0);
            } else {
                long sum=1;
                for(int i=1;i<=n/2;i++) {
                    sum *= (long) i*i%m;
                    sum=sum%m;
                }

                System.out.println(sum);
            }

        }
    }
}
