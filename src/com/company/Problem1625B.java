package com.company;
import java.util.*;

public class Problem1625B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int [] array = new int[length];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
                    int ans = -1;
                    for (int i = 0; i < length; i++) {
                        if (map.containsKey(array[i])) {
                            int j = map.get(array[i]);
                            ans = Integer.max(ans, length - i + j);
                }
                map.put(array[i], i);
            }
            System.out.println(ans);

        }

    }

}
