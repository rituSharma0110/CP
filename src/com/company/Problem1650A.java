package com.company;
import java.util.*;

public class Problem1650A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            char[] array = str.toCharArray();
            String s = scanner.next();
            char[] charArray = s.toCharArray();
            boolean is = false;
            if (str.contains(s)){
                for (int i =0;i<str.length();i++){
                    if (array[i]==charArray[0] && (i+1)%2!=0){
                        is= true;
                        break;
                    }else {
                        is = false;
                    }
                }

            }
            if (is){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
