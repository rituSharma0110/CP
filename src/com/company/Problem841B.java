package com.company;
import java.util.*;

public class Problem841B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        long even = 0;
        long odd = 0;
        for (int i =0;i<size;i++){
            long val = scanner.nextLong();
            if (val%2==0){
                even++;
            }else odd++;
        }
        if (even==size){
            System.out.println("Second");
        }else System.out.println("First");

    }
}
// 10^9 operations can be executed in 2 sec
