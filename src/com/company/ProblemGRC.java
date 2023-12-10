package com.company;

import java.util.Scanner;

public class ProblemGRC {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int [size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();

            }
            if (size==3&&array[1]%2==1) {
                System.out.println(-1);
                continue;
            }
            boolean allOne = false;
            for (int i =1;i< array.length-1;i++){
                if (array[i]==1){
                    allOne=true;
                }else {
                    allOne=false;
                    break;
                }
            }
            long cnt =0;
            if (allOne){
                System.out.println(-1);
            }else {
                for(int i =1;i< array.length-1;i++){
                    if (array[i]%2==0 && array[i]>=2){
                        cnt+=array[i]/2;
                    }else {
                        cnt+=(array[i]+1)/2;
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
