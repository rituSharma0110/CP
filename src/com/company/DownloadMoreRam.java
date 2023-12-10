package com.company;

import java.util.*;

public class DownloadMoreRam {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
     outer:   while (tc-->0) {
            int soft = scanner.nextInt();
            int ava = scanner.nextInt();
            int[] array = new int[soft];
            int[] array1 = new int[soft];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < array.length; i++) {
                array1[i] = scanner.nextInt();
            }
            bubbleSort(array,array1);
            int min = minimum(array);

                if (min>ava){
                    System.out.println(ava);
                    continue outer;
            }
            int sum =ava;
            for (int i = 0; i < array.length; i++) {
               if (ava>=array[i]){
                   sum = ava + array1[i];
                   ava = sum;
               }
            }
            System.out.println(sum);
        }
    }
    static void bubbleSort(int arr[],int array1[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    int temp1= array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp1;
                }
    }
    static int minimum (int [] array){
        int min =array[0];
        for (int i =0;i< array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
