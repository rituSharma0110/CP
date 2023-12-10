package com.company;
import java.util.*;


public class Problem1278A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
     out:   while (tc-->0){
            String p = scanner.next();
            String h = scanner.next();
            if (p.length()>h.length()){
                System.out.println("NO");
                continue;
            }

            for (int i =0;i<h.length();i++){
                if (i+ p.length()>h.length()){
                    break ;
                }
                if (isSubstring(p, h.substring(i,i+ p.length()))){
                    System.out.println("YES");
                    continue out;
                }
            }
            System.out.println("NO");

        }
    }
    static boolean isSubstring( String p , String h){
        boolean yes = false;
        char [] p1 = p.toCharArray();
        char [] h1 = h.toCharArray();
        Arrays.sort(p1);
        Arrays.sort(h1);
        if (Arrays.equals(p1,h1)){
            yes = true;
        }
        return yes;
    }
}
