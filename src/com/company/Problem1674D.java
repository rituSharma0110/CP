package com.company;
import java.util.*;

public class Problem1674D {
    public static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length=scanner.nextInt();
            int[] array= new int[length];
            for (int i =0;i<array.length ;i++){
                array [i] = scanner.nextInt();
            }
            int start=0;
            if(length%2!=0){
                start=1;
            }
            boolean isPossible=true;
            for(int i=start;i<length-1;i+=2){
                if(array[i]>array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
            for(int i=1;i<length;i++){
                if(array[i]<array[i-1]){
                    isPossible=false;
                    break;
                }
            }
            System.out.println(isPossible ? "YES" : "NO");
        }

    }

}
