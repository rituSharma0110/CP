package com.company;
import java.util.*;

public class Problem1592B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
      out:  while(tc-->0){
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            Integer [] array = new Integer[n];
            for(int i =0;i<n;i++){
                array[i] = scanner.nextInt();
            }
          Integer [] clone = new Integer[n];
          for(int i =0;i<n;i++){
              clone[i]=array[i];
          }

            Arrays.sort(clone);
            for (int i = n-x; i <= x-1; i++) {
                if (array[i]!=clone[i]) {
                    System.out.println("NO");
                    continue out;
                }
            }
            System.out.println("YES");

        }

    }

}
