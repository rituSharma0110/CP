package com.company;

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int [] array = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
        boolean yes = false;
        for (int i =0;i< array.length;i++){
            if (number==array[i] || number%array[i]==0){
                yes = true;
            }
        }
        if (yes) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
