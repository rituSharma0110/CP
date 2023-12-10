package com.company;
import java.util.*;

public class Problem1678B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            String str = scanner.next();
            char [] array = str.toCharArray();
            int cnt=0;
            int ans =0;
            for (int i =0;i<n-1;i++){
                if (array[i]==array[i+1]){
                    cnt++;
                }
                if (array[i]!=array[i+1] && (i+1)%2!=0){
                    if (array[i]=='0'){
                        array[i]='1';

                    }else {
                        array[i]='0';
                    }
                    cnt=0;
                    ans++;
                }
            }

            System.out.println(ans);
        }

    }
}
