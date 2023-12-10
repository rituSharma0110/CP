package com.company;
import java.util.*;

public class Problem1631B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int cnt =0;
            int val = n-1;
            int length = 0;
            while(val>=0) {

                if(array[val]==array[n-1]) {
                    val--;
                    length++;
                }
                else {
                    cnt++;
                    val -= length;
                    length = length*2;
                }
            }

            System.out.println(cnt);

        }

    }
}
