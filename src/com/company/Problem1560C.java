package com.company;
import java.util.*;

public class Problem1560C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int k = scanner.nextInt();
            int column = 1;
            while (column * column < k) {
                column++;
            }
            int d = k - (column - 1) * (column - 1);
            if (d < column) {
                System.out.println(d + " " + column);
            } else {
                System.out.println(column + " " + (2 * column - d));
            }
        }
    }
}
