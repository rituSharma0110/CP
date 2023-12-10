package com.company;
import java.util.*;

public class Problem1249B1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int [] array = new int[length];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
                array[i]--;
            }
            for(int j=0;j<length;j++){
                int cnt=1;
                int i=array[j];
                while(i!=j){
                    i=array[i];
                    cnt++;
                }
                System.out.print(cnt+" ");
            }
            System.out.println();

        }
    }
}
