package com.company;

import java.util.Scanner;

public class MakeItDivisible {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String number = scanner.next();
            char [] array = number.toCharArray();
            int ans =0;
            for (int i =0;i< array.length;i++){
                for (int j =i+1;j< array.length;j++){
                    if(array[i]=='2' && array[j]=='5'){
                        ans = array.length-i-2;
                    }else if (array[i] == '7' && array[j]=='5'){
                        ans = array.length-i-2;
                    }else if (array[i] == '5' && array[j] =='0'){
                        ans = array.length-i-2;
                    }else if (array[i] =='0' && array[j]=='0'){
                        ans = array.length-i-2;
                    }
                }
            }
            System.out.println(ans);

        }
    }
}
