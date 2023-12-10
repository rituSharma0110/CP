package com.company;
import java.util.*;

public class Problem1626B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            char [] array = str.toCharArray();
            int val=0;
            for(int i=array.length-2;i>=0;i--){
                int x=array[i]-'0',y=array[i+1]-'0';
                if(x+y>=10){
                    val=i;
                    break;
                }
            }
            for(int i=0;i<array.length;i++){
                if(i==val+1){
                    continue;
                }
                if(i==val){
                    int x=array[i]-'0',y=array[i+1]-'0';
                    System.out.print(x+y);
                }
                else{
                    System.out.print(array[i]);
                }
            }
            System.out.println();

        }
    }
}
