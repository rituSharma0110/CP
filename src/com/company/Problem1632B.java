package com.company;
import java.util.*;
public class Problem1632B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int number = scanner.nextInt();
            int bit = countBit(number-1);
            for (int i = (1<<(bit-1))-1;i>=0;i--){
                System.out.print(i + " ");
            }
            for (int i = 1<<(bit-1); i<number; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
    static int countBit(int n){
        int cnt = 0;
        while (n!=0){
            n/=2;
            cnt++;
        }
        return cnt;
    }


}
