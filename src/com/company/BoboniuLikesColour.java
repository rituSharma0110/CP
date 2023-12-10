package com.company;

import java.util.Scanner;

public class BoboniuLikesColour {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();

        int tc = scanner.nextInt();
        while (tc-->0) {
            int [] array = new int[4];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int count =0;
            for (int i =0;i< array.length;i++){
                if ((array[i] & 1) == 1){
                    count++;
                }
            }
            if (count<=1){
                System.out.println("Yes");
                continue;// this is written so that if we exit that test case.
            }
            if (array[0]==0 || array[1]==0 || array[2]==0){
                System.out.println("No");
                continue;
            }
            if (count==2){
                System.out.println("No");
            }else System.out.println("Yes");
        }
        long finalTime = System.currentTimeMillis();

        System.out.println(finalTime-initialTime);

    }

}
