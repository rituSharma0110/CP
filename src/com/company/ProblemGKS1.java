package com.company;
import java.util.*;

public class ProblemGKS1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        for (int i =0;i<tc;i++) {
            System.out.print("Case #" + (i+1) + ": ");
            int length = scanner.nextInt();
            String str = scanner.next();
            StringBuilder sbr = new StringBuilder(str);
            boolean isDigit = false;
            boolean isLower = false;
            boolean isUpper = false;
            boolean isSpecial = false;
            for (int j=0;j<length;j++){
                if (Character.isDigit(str.charAt(j))){
                    isDigit = true;
                }
                else if (Character.isLowerCase(str.charAt(j))){
                    isLower = true;
                }
                else if (Character.isUpperCase(str.charAt(j))){
                    isUpper= true;
                }
                else if (str.charAt(j)=='*' || str.charAt(j)=='&' || str.charAt(j)=='#' || str.charAt(j)=='@'){
                    isSpecial=true;
                }
            }
            if (!isDigit){
                sbr.append('1');
            }
            if (!isSpecial){
                sbr.append('*');
            }
            if (!isLower){
                sbr.append('a');
            }
            if (!isUpper){
                sbr.append('A');
            }

            if (sbr.length()<7 ){
                int val = 7-sbr.length();
                for (int j =0;j<val;j++){
                    sbr.append('a');
                }
            }
            System.out.println(sbr);




        }
    }
}
