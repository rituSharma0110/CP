package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Problem1665B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int [] array = new int[length];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int max =0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i =0;i< array.length;i++){
                if (map.containsKey(array[i])){
                    map.put(array[i], map.get(array[i]) + 1);
                }else {
                    map.put(array[i], 1);
                }
                max = Math.max(max, map.get(array[i]));
            }
            int rem= length-max;
            int var = max;
            int rem2 = rem;
            while (true){
                if (rem2<=0) {
                    break;
                }
                    rem2-=var;
                    var*=2;
                    rem++;
            }
            System.out.println(rem);
        }
    }
}
