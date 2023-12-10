package com.company;

import java.util.Scanner;

public class CaseOfZeroesAndOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String str = scanner.next();
        int cnt0 = 0;
        int cnt1 = 0;
        char[] array = str.toCharArray();

        for (int i =0;i< array.length;i++){
            if (array[i]=='0'){
                cnt0++;
            }else {
                cnt1++;
            }
        }
        if (cnt0==cnt1){
            System.out.println(size-2*cnt0);
        }else if (cnt0<cnt1){
            System.out.println(size - 2*cnt0);
        }else System.out.println(size - 2*cnt1);

    }
}
