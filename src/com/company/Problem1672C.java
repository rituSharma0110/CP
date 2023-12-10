package com.company;
import java.util.*;

public class Problem1672C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i<array.length;i++) {
                array[i] = scanner.nextInt();
            }

            int firstIndex =n;
            int lastIndex = -1;
            for (int i = 1;i < n;++ i) {
                if (array[i - 1] == array[i]) {
                    firstIndex = Math.min(firstIndex, i);
                    lastIndex = Math.max(lastIndex, i);
                }
            }
            if (lastIndex == -1 || firstIndex == lastIndex) {
                System.out.println(0);
            }
            else{
                System.out.println(Math.max(1, lastIndex - firstIndex - 1));
                }
        }

    }
}
