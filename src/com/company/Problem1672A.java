package com.company;
import java.util.*;

public class Problem1672A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();

            if (str.length()==1){
                System.out.println("NO");
                continue;
            }
            if (str.charAt(str.length()-1)!='B'){
                System.out.println("NO");
                continue;
            }
            boolean isPossible = true;
            int cntA = 0;
            int cntB =0;
            for (int i =0;i<str.length();i++){
                if (str.charAt(i)=='A'){
                    cntA++;
                }else {
                    cntB++;
                }
                if (cntA<cntB){
                    isPossible=false;
                    break;
                }
            }
            System.out.println(isPossible ? "YES" : "NO");

        }
    }
}
