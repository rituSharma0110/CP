package com.company;
import java.util.*;

public class Problem1673B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            char [] array = scanner.next().toCharArray();
            HashSet<Character> set = new HashSet<>();
            for (int i =0;i< array.length;i++){
                set.add(array[i]);
            }

            boolean isPossible = false;
            for (int i = set.size();i< array.length;i++){
                if (array[i- set.size()]!= array[i]){
                    isPossible = true;
                }
            }
            System.out.println(isPossible? "NO" : "YES");
        }

    }
}
