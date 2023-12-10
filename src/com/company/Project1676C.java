package com.company;
import java.util.*;

public class Project1676C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int q = scanner.nextInt();
            int n = scanner.nextInt();
            String [] array = new String[q];
            for (int i =0;i<q;i++){
                array[i]= scanner.next();
            }
            int min = Integer.MAX_VALUE;
            int diff =0;
            for (int i =0;i<q;i++){
                for (int j =i+1;j<q;j++){
                    diff=0;
                    for (int k =0;k<n;k++) {

                        diff += Math.abs(array[i].charAt(k) - array[j].charAt(k));
                    }
                    min = Math.min(diff, min);
                }

            }
            System.out.println(min);


        }
    }
}
