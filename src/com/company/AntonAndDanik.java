package com.company;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String str = scanner.next();
        char [] array = str.toCharArray();
        int a =0;
        int d =0;
        for (int i =0;i< array.length;i++){
            if (array[i]=='A'){
                a++;
            }else d++;
        }
        if (a>d){
            System.out.println("Anton");
        }else if (d>a){
            System.out.println( "Danik");
        }else System.out.println("Friendship" );
    }
}
