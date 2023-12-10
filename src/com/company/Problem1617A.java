package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1617A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            String string = scanner.next();
            String sub = scanner.next();
            char[] array = string.toCharArray();
            Arrays.sort(array);
            if (!sub.equals("abc")){
                String str = new String(array);
                System.out.println(str);
                continue;
            }
            int countB = 0;
            int countC =0;
            int countA=0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 'b') {
                    countB++;
                }else if (array[i]=='c'){
                    countC++;
                }else if (array[i]=='a'){
                    countA++;
                }
            }
            if (countA==0 || countB==0 || countC==0){
                String str = new String(array);
                System.out.println(str);
                continue;
            }

            for (int i =countA;i>0;i--){
                System.out.print('a');
            }
            for (int i =countC;i>0;i--){
                System.out.print('c');
            }
            for (int i =countB;i>0;i--){
                System.out.print('b');
            }

            for (int i =0;i< array.length;i++){
                if (array[i]=='a' || array[i]=='b' || array[i]=='c'){
                    continue;
                }
                System.out.print(array[i]);
            }
            System.out.println();
            }

    }

}
