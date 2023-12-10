package com.company;

import java.util.Scanner;

public class DislikeOfThree {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int fav = scanner.nextInt();

            int count =0;
            if (fav==1 || fav==2){
                System.out.println(fav);
                continue;
            }
            int num = fav;
            for (int i =1;i<=fav;i++){
                int lastDigit = i%10;
                if (i%3==0 || lastDigit==3){
                    count++;
                    fav+=1;

                }
            }
            System.out.println(num + count);
        }
    }
}
