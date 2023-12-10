package com.company;
import java.util.*;

public class Problem1684B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            long a = z;
            long b = y+z;
            long c = b + x;
            System.out.println(c + " " + b  + " " + a);
        }

    }
}
