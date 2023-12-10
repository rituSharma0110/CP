package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AndOrUni {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i=0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            ArrayList<Integer> list = new ArrayList<>();

            list =arrayOfAnd(array);
            int [] array1 = new int[list.size()];
            for (int i=0;i< array1.length;i++){
                array1[i] = list.get(i);
            }
            arrayOr(array1);
            int [] array2 = new int[list1.size()];

            for (int i=0;i< array1.length;i++){
                array2[i] = list1.get(i);
            }
            System.out.println(Arrays.toString(array2));


        }

    }
    static ArrayList<Integer> arrayOfAnd(int [] array){
         ArrayList<Integer> list = new ArrayList<>();
        int n = array.length;
        for (int i=0;i< array.length;i++){
            int j = array.length-1;
            while (j>i){
                int and = array[i] & array[j];
                list.add(and);
                j--;
            }
        }
        return list;
    }
    static ArrayList<Integer> list1 = new ArrayList<>();
    static int [] newArray = new int[1];
    static void arrayOr(int [] array){
        Arrays.sort(array);
        if (array.length==1){
            return ;
        }

//        int max =array[0];
//        int min =array[0];
//        for (int i=0;i< array.length;i++) {
//             max = Math.max(array[0],array[i] );
//        }
//        for (int i=0;i< array.length;i++) {
//             min = Math.min(array[0],array[i] );
//        }
        int min = array[0];
        int max = array.length-1;
        int sub = min|max;
        list1.add(sub);
        for (int i =1;i< array.length-1;i++){
            list1.add(array[i]);
        }
        for (int i=0;i< list1.size();i++){
            newArray[i] = list1.get(i);
        }
       arrayOr(newArray);
    }

//    the above orArray function would give tle

}
