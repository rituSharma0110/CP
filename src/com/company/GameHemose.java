package com.company;

import java.util.Scanner;

public class GameHemose {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int size = scanner.nextInt();
            long health = scanner.nextLong();
            int[] array = new int[size];
            int [] target = new int[]{-1,-1};
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[i]>target[1]){
                    target[1] = array[i];
                }
                if (target[1]>target[0]){
                    int temp = target[0];
                    target[0] =target[1];
                    target[1]=temp;
                }
            }

            long count = 2*(health/(target[0] + target[1]));
            health = health%(target[0] + target[1]);

            int p =0;
            while (health>0){
                health-=target[p];
                p = (p+1)%2;
                count++;
            }
            System.out.println(count);
        }
    }
}
