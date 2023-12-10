package com.company;
import java.util.*;

public class Problem1480B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            long ai= scanner.nextLong();
            long hi = scanner.nextLong();
            int monsters = scanner.nextInt();
            long []aMonsters = new long[monsters];
            long [] hMonsters = new long[monsters];
            for (int i =0;i<monsters;i++){
                aMonsters[i] = scanner.nextInt();
            }
            for (int i =0;i<monsters;i++){
                hMonsters[i] = scanner.nextInt();
            }
            long max = 0;
            for(int i=0; i<monsters; i++) {
                max = Math.max(max, aMonsters[i]);
                long times = (hMonsters[i] + ai - 1) / ai;
                hi -= times * aMonsters[i];
            }
            boolean isPossible = false;

            if(hi + max >= 1) {
                isPossible = true;
            }
            System.out.println(isPossible ? "YES" : "NO");
        }
    }
}
