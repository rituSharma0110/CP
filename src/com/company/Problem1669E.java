package com.company;
import java.util.*;

public class Problem1669E {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int q = scanner.nextInt();
            int [][]hsh = new int[26][26];
            long ans = 0;
            for(int i = 0 ; i < q ; i++) {
                String str = scanner.next();
                for(int j = 0 ; j < 26 ; j++) {
                    if(j != str.charAt(1)-'a') {
                        ans += hsh[str.charAt(0) - 'a'][j];
                    }

                    if(j != str.charAt(0)-'a') {
                        ans += hsh[j][str.charAt(1) - 'a'];
                    }
                }
                hsh[str.charAt(0)-'a'][str.charAt(1)-'a']++;
            }
            System.out.println(ans);

        }
    }
}
