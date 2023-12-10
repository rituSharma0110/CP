package com.company;
import java.util.*;

public class Problem1682B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
 out:       while (tc-->0){
            int n = scanner.nextInt();
            Integer [] array = new Integer[n];
            for (int i =0;i<n;i++){
                array[i]= scanner.nextInt();
            }
            Integer[] clone = array.clone();
            Arrays.sort(clone);
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> index = new ArrayList<>();

            for (int i =0;i< array.length;i++){
                if (array[i]!=clone[i]){
                    list.add(array[i]);
                }
            }
            long ans =list.get(0);
            for(int i =0;i< list.size();i++){
                ans = ans& list.get(i);
            }
            System.out.println(ans);


        }

    }


}
