package com.company;
import java.util.*;

public class Project1635C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }

            boolean isPossible = true;
            for (int i =0;i< array.length-1;i++){
                if (array[i]>array[i+1]){
                    isPossible = false;
                }
            }
            if (isPossible){
                System.out.println(0);
                continue;
            }
            for (int i =0;i< array.length-2;i++){
                array[i] = array[n-2]- array[n-1];
            }
             isPossible = true;
            for (int i =0;i< array.length-1;i++){
                if (array[i]>array[i+1]){
                    isPossible = false;
                }
            }
            if (!isPossible){
                System.out.println(-1);
            }else{
                System.out.println(n-2);
                for (int i =0;i<n-2;i++){
                    System.out.println((i+1) + " " + (n-1) + " " + (n));
                }
            }


// here if last third is not less than the other twos than it  can not be possible for array to be sorted as x<y<z

        }

    }
}
