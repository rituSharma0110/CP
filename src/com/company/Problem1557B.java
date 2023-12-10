package com.company;
import java.util.*;

public class Problem1557B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int [] array = new int[n];
            HashMap<Integer,Integer> hm =  new HashMap<>();
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
                hm.put(array[i],i );
            }
            int [] clone = array.clone();
            Arrays.sort(clone);
            int cnt =0;
            for (int i =0;i<n-1;i++){
                int val1 = hm.get(clone[i]);
                int val2 = hm.get(clone[i+1]);

                if (val1+1==val2){
                    cnt++;
                }
            }
            System.out.println(cnt>=(n-s)?"YES":"NO");

        }
    }
}
