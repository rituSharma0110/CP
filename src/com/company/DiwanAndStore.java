package com.company;

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class DiwanAndStore {
//    public static Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {
//        int tc = scanner.nextInt();
//        while (tc-->0){
//            int size = scanner.nextInt();
//            long lowerPrice = scanner.nextLong();
//            long upperPrice = scanner.nextLong();
//            long tMoney = scanner.nextLong();
//            long [] array = new long[size];
//            for (int i =0;i< array.length;i++){
//                array[i] = scanner.nextInt();
//            }
//            Arrays.sort(array);
//            int count =0;
//            for (int i=0;i< array.length;i++){
//                if (array[i]>tMoney){
//                    break;
//                }else if (array[i]>=lowerPrice && array[i]<=upperPrice ){
//                        count++;
//                        tMoney= tMoney-array[i];
//                }
//            }
//            System.out.println(count);
//        }
//    }
//}
import java.util.Arrays;
import java.util.Scanner;

public class DiwanAndStore {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int lowerPrice = scanner.nextInt();
            int upperPrice = scanner.nextInt();
            int tMoney = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            int count =0;
            long sum =0;
            for (int i=0;i< array.length;i++){
                if (tMoney<array[i]){
                    break;
                }else if (array[i]>=lowerPrice && array[i]<=upperPrice ){
                    sum+= array[i];
                    if (sum<=tMoney) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
