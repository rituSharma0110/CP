package com.company;
import java.util.*;

public class Problem1669D {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int length = scanner.nextInt();
            String str = scanner.next();
            String [] array = str.split("W");
            boolean isPossible = true;
            for (String s : array){
                if (s.isEmpty()){
                    continue;
                }
                boolean r = false; boolean b = false;
                for (int i =0;i<s.length();i++){
                    if (s.charAt(i)=='R'){
                        r = true;
                    }else b = true;
                }
                if (!(r && b)){
                    isPossible=false;
                }

            }

            if (isPossible){
                System.out.println("YES");
            }else System.out.println("NO");

        }
    }
}