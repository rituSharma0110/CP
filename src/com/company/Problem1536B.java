package com.company;
import java.util.*;

public class Problem1536B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
         out:while (tc-->0){
            int n = scanner.nextInt();
            String str = scanner.next();
            Set <String > set = new HashSet<>();

            for (int i =0;i<n;i++){
                String string = "";
                string+=(str.charAt(i));
                set.add(string);
            }
            for (int i=0;i<26;i++ ){
                String string = "";
                string+=(char)(i+'a');
                if (!set.contains(string)){
                    System.out.println(string);
                    continue out;
                }
            }
             for (int i =0;i<n-1;i++){
                 String string = "";
                 string+=(str.charAt(i));
                 string+=(str.charAt(i+1));
                 set.add(string);
             }

             for (int i=0;i<26;i++ ){
                 for (int j =0;j<26;j++) {
                     String string = "";
                     string += (char) (i + 'a');
                     string += (char) (j + 'a');
                     if (!set.contains(string)) {
                         System.out.println(string);
                         continue out;
                     }
                 }
             }
             for (int i =0;i<n-2;i++){
                 String string = "";
                 string+=(str.charAt(i));
                 string+=(str.charAt(i+1));
                 string+=(str.charAt(i+2));
                 set.add(string);
             }

             for (int i=0;i<26;i++ ){
                 for (int j =0;j<26;j++) {
                     for (int k =0;k<26;k++) {
                         String string = "";
                         string += (char) (i + 'a');
                         string += (char) (j + 'a');
                         string += (char) (k + 'a');
                         if (!set.contains(string)) {
                             System.out.println(string);
                             continue out;
                         }
                     }
                 }
             }
         }
    }
}
