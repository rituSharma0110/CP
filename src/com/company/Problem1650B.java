package com.company;
import java.util.*;

public class Problem1650B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int a = scanner.nextInt();
            int x = r / a + r % a;
            r -= r % a;
            r--;
            if (r >= l) {
                x = Math.max(x, r / a + r % a);
            }
            System.out.println(x);
        }
    }
}
