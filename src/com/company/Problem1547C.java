package com.company;

import java.util.*;

public class Problem1547C {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            scanner.nextLine();
            int k = scanner.nextInt();// Number of lines
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] mArray = new int[n];
            int[] pArray = new int[m];
            for (int i = 0; i < n; i++) {
                mArray[i] = scanner.nextInt();

            }
            for (int i = 0; i < m; i++) {
                pArray[i] = scanner.nextInt();

            }
            ArrayList<Integer> list = new ArrayList<>();
            int i = 0;
            int j = 0;
            while (i < n && j < m) {
                if (mArray[i] == 0) {
                    k++;
                    list.add(mArray[i++]);
                } else if (pArray[j] == 0) {
                    k++;
                    list.add(pArray[j++]);
                } else {
                    if (mArray[i] <= k) list.add(mArray[i++]);
                    else if (pArray[j] <= k) list.add(pArray[j++]);
                    else break;
                }
            }

            while (i < n) {
                if (mArray[i] == 0) {
                    k++;
                    list.add(mArray[i++]);
                } else if (mArray[i] <= k) list.add(mArray[i++]);
                else break;
            }
            while (j < m) {
                if (pArray[j] == 0) {
                    k++;
                    list.add(pArray[j++]);
                } else if (pArray[j] <= k) list.add(pArray[j++]);
                else break;
            }
            if (list.size() != n + m) {
                System.out.println(-1);
                continue;
            }

            for (Integer integer : list) {
                System.out.print(integer + " ");
            }

            System.out.println();

        }

    }
}
