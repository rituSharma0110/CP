package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char [] array = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i =0;i<array.length;i++){
            set.add(array[i]);
        }
        if (set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else System.out.println("IGNORE HIM!");
    }
}
