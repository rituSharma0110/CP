package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EqualOrNotEqual {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String string = scanner.next();
            char [] array = string.toCharArray();
            Arrays.sort(array);
            String newString = String.valueOf(array);
            int count =0;
            for (int i =0;i< array.length;i++){
                if (array[i] == 'N'){
                    count++;
                }
            }
            if (string.equals("EN")|| string.equals("NE")||newString.equals("EEN")){
                System.out.println("NO");
            }else if (count==1){
                System.out.println("NO");
            }else System.out.println("YES");
        }
        System.exit(0);
    }
}
