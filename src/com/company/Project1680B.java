package com.company;
import java.util.*;

public class Project1680B {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char [][] array = new char[5][5];
            for (int i =0;i<n;i++){
                String str = scanner.next();
                for (int j =0;j<m;j++){
                    array[i][j]= str.charAt(j);
                }
            }
            boolean first = false;
            int min1=Integer.MAX_VALUE;
            int min2=Integer.MAX_VALUE;
            for (int i =0;i<n;i++){
                for (int j =0;j<m;j++){
                    if(!first && array[i][j]=='R'){
                        first = true;
                        min1 = Math.min(min1,(j));

                    }else if (first && array[i][j]=='R'){
                        min2 = Math.min(min2,(j));
                    }
                }
            }
            if (min2<min1){
                System.out.println("NO");
            }else System.out.println("YES");
        }
    }
}
