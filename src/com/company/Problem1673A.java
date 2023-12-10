package com.company;
import java.util.*;

public class Problem1673A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            if (str.length()==1){
                System.out.print("Bob ");
                int ans = (int)str.charAt(0) -96;
                System.out.println(ans);
                continue;
            }
            if (str.length()%2!=0) {
                int ans1 = 0;
                for (int i = 1; i < str.length(); i++) {
                    ans1 += str.charAt(i) - 96;
                }
                ans1-=str.charAt(0)%97;
                int ans2 = 0;
                for (int i = 0; i < str.length() - 1; i++) {
                    ans2 += str.charAt(i) - 96;
                }
                ans2-=str.charAt(str.length()-1)%97;

                int res = Math.max(ans1, ans2);
                System.out.println("Alice " + (res-1));
            }else {
                int ans =0;
                for (int i =0;i<str.length();i++){
                    ans += str.charAt(i) - 96;
                }
                System.out.println("Alice " + ans );
            }

        }
    }
}
