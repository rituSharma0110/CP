package com.company;
import java.util.*;

public class Problem1668A {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            long cnt =0;
            if (rows==1 && cols==1){
                System.out.println(0);
                continue;
            }
            if ((rows==1&& cols!=2) || (cols==1 && rows!=2)){
                System.out.println(-1);
                continue;
            }
            if (rows>cols){
                cnt+= (2L*cols-2);
                rows-=cols;
                rows++;
                if (rows%2!=0){
                    cnt+=rows*2L-2;
                }else {
                    cnt+=rows*2L-3;
                }
            }else {
                cnt+= (2L*rows-2);
                cols-=rows;
                cols++;
                if (cols%2!=0){
                    cnt+=cols*2L-2;
                }else {
                    cnt+=cols*2L-3;
                }
            }
            System.out.println(cnt);
        }


    }
}
