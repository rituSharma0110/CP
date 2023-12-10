package com.company;
import java.util.*;

public class Problem1678A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array =  new int[n];
            int hsh[] = new int[105];
            boolean isZero = false;
            int cnt =0;
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
                hsh[array[i]]++;
                if (array[i]==0){
                    isZero = true;
                    cnt++;
                }
            }
            if (isZero) {
                if (cnt == n) {
                    System.out.println(0);
                    continue;
                }else{
                    System.out.println(n-cnt);
                    continue;
                }

            }
            boolean flag = false;
            for (int i =0;i< hsh.length;i++){
                if (hsh[i]>=2){
                    flag = true;
                    break;
                }
            }
            if (flag){
                System.out.println(n);
            }else System.out.println(n+1);


        }
    }
}
