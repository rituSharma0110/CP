package com.company;
import java.util.*;

public class Problem1428B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int length = scanner.nextInt();
            String str = scanner.next();
            int cnt =0;
            boolean isCw = false;
            boolean isACW =false;
            for (int i =0;i<length;i++){
                if (str.charAt(i)=='<'){
                    isACW = true;
                }else if (str.charAt(i)=='>') isCw = true;
            }
            if (isACW && isCw){
                for (int i =0;i<length;i++){
                    if (str.charAt(i)=='-' || str.charAt((i+1)%length)=='-'){
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }else System.out.println(length);



        }

    }
}
