package com.company;
import java.util.*;

public class Problem1611C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }

            if (array[0]!=size && array[size-1]!=size){
                System.out.println(-1);
                continue;
            }
            for (int i =size-1;i>=0;i--){
                System.out.print(array[i]+" ");
            }

            System.out.println();
        }
    }
}
// undone