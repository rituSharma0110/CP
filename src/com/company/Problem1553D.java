package com.company;
import java.util.*;

public class Problem1553D {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            String ptr = scanner.next();
            int i = str.length()-1;
            int j = ptr.length()-1;
            for (;i>=0 && j>=0;){
                if (str.charAt(i)==ptr.charAt(j)){
                    i--;
                    j--;
                }else i-=2;
            }
            if (j!=-1){
                System.out.println("NO");
            }else System.out.println("YES");
        }
    }
}
