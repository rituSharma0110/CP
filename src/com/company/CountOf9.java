package com.company;

public class CountOf9 {
    public static void main(String[] args) {
        int number = 15500;
        int count =0;
        for (int i =1 ;i<number;i++){
            int remainder = i%10;
            if (remainder==9){
                count++;
            }
        }
        System.out.println(count);
    }
}
