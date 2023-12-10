package com.company;

import java.util.Scanner;

public class Problem1506B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int k = scanner.nextInt();
            String str = scanner.next();
            char [] array = str.toCharArray();
            int cnt = 0;
            for (int i =0;i< array.length;i++){
                if (array[i]=='*'){
                    cnt++;
                }
            }
            int firstIndex = 0;
            for (int i =0;i< array.length;i++){
                if (array[i]=='*'){
                    firstIndex=i;
                    break;
                }
            }
            int lastIndex = length-1;
            while (str.charAt(lastIndex) !='*'){
                lastIndex--;
            }
            int cntOfX = 0;
            int dist = 0;
            int current =0;
            for (int i =firstIndex+1;i< lastIndex;i++){
                dist++;
                if (array[i]=='*' ) {
                    current = i;
                }
                if (dist==k){
                    cntOfX++;
                    dist=0;
                    i= current;
                }


            }
            if (cnt<=2){
                System.out.println(cnt);
            }else {
                System.out.println(cntOfX + 2);
            }

        }
    }
}
