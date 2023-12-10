package com.company;
import java.util.*;
public class Problem991B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int [] array = new int[n];
        double sum = 0;
        int cnt =0;
        for (int i =0;i< array.length;i++){
            array[i]= scanner.nextInt();
            sum+=array[i];
        }
        Arrays.sort(array);
        for (int i =0; sum<4.5*n;i++){
            sum+= -array[i]+ 5;
            cnt++;
        }
        System.out.println(cnt);

    }
}
