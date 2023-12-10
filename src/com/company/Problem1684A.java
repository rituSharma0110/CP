package com.company;
import java.util.*;

public class Problem1684A {
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            String string = scanner.next();
            if(string.length()==2){
                System.out.println(string.charAt(1));
                continue;
            }
            int min = 9;
            for (int i =0;i<string.length();i++){
                min = Math.min(string.charAt(i)-'0',min);
            }
            System.out.println(min);


        }
    }
}
