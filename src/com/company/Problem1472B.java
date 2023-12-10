package com.company;
import java.util.*;

public class Problem1472B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int [] array = new int[length];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int cnt2 =0;
            int cnt1 =0;
            int sum =0;
            for (int i =0;i< array.length;i++) {
                sum += array[i];
                if (array[i] == 2) {
                    cnt2++;
                }else cnt1++;
            }

            if( sum%2==0){
                if( cnt2%2==0  && cnt1%2==0) {
                    System.out.println("YES");
                } else if( cnt2%2==1 && (cnt1>=2 && cnt1%2==0) ){
                    System.out.println("YES");
                }else System.out.println("NO");

            }else System.out.println("NO");
        }

    }
}
