package com.company;
import java.util.*;

public class Problem439A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int songs = scanner.nextInt();
        int duration = scanner.nextInt();
        int [] array = new int[songs];
        int sum = 0;
        for (int i =0;i<songs;i++){
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        if ((sum + (songs-1)*10) > duration){
            System.out.println(-1);
        }else System.out.println((duration-sum)/5);
    }
}
