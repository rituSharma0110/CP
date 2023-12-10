package com.company;
import java.util.*;

public class Problem1406B {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            Long [] array = new Long[n];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextLong();
            }
            Arrays.sort(array);
            long product = 1;
            if(array[n-1] < 0) {
                product = array[n-1] * array[n-2] * array[n-3] * array[n-4] * array[n-5];
            } else {
                product = array[n-1] * array[n-2] * array[n-3] * array[n-4] * array[n-5];
                product = Math.max(product, (array[0] * array[1] * array[n-1] * array[n-2] * array[n-3]));
                product = Math.max(product, (array[0] * array[1] * array[2] * array[3] * array[n-1]));
            }
            System.out.println(product);

        }
    }
}
