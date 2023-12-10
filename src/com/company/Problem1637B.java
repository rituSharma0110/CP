package com.company;
import java.util.*;

public class Problem1637B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int length = scanner.nextInt();
            long [] array = new long[length];
            for (int i =0;i<array.length;i++){
                array[i] = scanner.nextInt();
            }
            int ans =0;
            for (int i = 0; i < length; i++) {
                for (int j =i; j < length; j++) {
                    for (int k = i; k <= j; k++) {
                        if (array[k]==0) {
                            ans++;
                        }
                        ans++;
                    }

                }
            }
            System.out.println(ans);
        }

    }
}
