package com.company;
import java.util.*;

public class Problem1669C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i< array.length;i++){
                array[i]= scanner.nextInt();
            }

            boolean evenAtEven= false;
            boolean oddAtEven= false;
            boolean oddAtOdd= false;
            boolean evenAtOdd= false;
           for (int i =0;i< array.length;i++){
               if (i%2==0){
                   if (array[i]%2==0){
                       evenAtEven = true;
                   }else oddAtEven = true;
               }else {
                   if (array[i]%2==0){
                       evenAtOdd = true;
                   }else oddAtOdd = true;
               }
           }
           if ((evenAtEven && oddAtEven) || (evenAtOdd && oddAtOdd)){
               System.out.println("NO");
           }else System.out.println("YES");
        }
    }
}
