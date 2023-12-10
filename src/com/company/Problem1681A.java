package com.company;
import java.util.*;

public class Problem1681A {
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n1 = scanner.nextInt();
            Integer [] aArray = new Integer[n1];
            for (int i =0;i<n1;i++){
                aArray[i] = scanner.nextInt();
            }
            int n2 = scanner.nextInt();
            Integer [] bArray = new Integer[n2];

            for (int i =0;i<n2;i++){
                bArray[i] = scanner.nextInt();
            }
            Arrays.sort(aArray);
            Arrays.sort(bArray);
            if (aArray[aArray.length-1]>bArray[bArray.length-1]){
                System.out.println("Alice");
                System.out.println("Alice");
            }else if (aArray[aArray.length-1]<bArray[bArray.length-1]){
                System.out.println("Bob");
                System.out.println("Bob");
            }else if (Objects.equals(aArray[aArray.length - 1], bArray[bArray.length - 1])){
                System.out.println("Alice");
                System.out.println("Bob");
            }

        }
    }
}
