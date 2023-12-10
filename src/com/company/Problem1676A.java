package com.company;
import java.util.*;

public class Problem1676A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            Integer n = Integer.parseInt(str);
            int sumStart =0;
            int sumLast =0;
            for (int i =0;i<3;i++){
                sumStart += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            for (int i =3;i<6;i++){
                sumLast += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            if (sumLast==sumStart){
                System.out.println("YES");
            }else System.out.println("NO");
        }

    }
}
