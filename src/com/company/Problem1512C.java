package com.company;

import java.util.*;

public class Problem1512C {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int cnt0 = scanner.nextInt();
            int cnt1 = scanner.nextInt();
            String st = scanner.next();
            StringBuilder str = new StringBuilder(st);
            int n = str.length();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '0') {
                    arr[i] = 0;
                    cnt0--;
                } else if (str.charAt(i) == '1') {
                    arr[i] = 1;
                    cnt1--;
                } else {
                    arr[i] = -1;
                }
            }
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) {
                    if (arr[n - i - 1] == 0) {
                        flag = false;
                        break;
                    }
                    if (arr[n - i - 1] == 1){
                        continue;
                    }
                    if (cnt1 == 0) {
                        flag = false;
                        break;
                    }
                    cnt1--;
                    arr[n - i - 1] = 1;
                }
                if (arr[i] == 0) {
                    if (arr[n - i - 1] == 1) {
                        flag = false;
                        break;
                    }
                    if (arr[n - i - 1] == 0) continue;
                    if (cnt0 == 0) {
                        flag = false;
                        break;
                    }
                    cnt0--;
                    arr[n - i - 1] = 0;
                }
            }
            if (flag) {
                for (int i = 0; i < (n + 1) / 2; i++) {
                    if (arr[i] == -1) {
                        if (i == n - i - 1) {
                            if (cnt0 > 0) {
                                cnt0--;
                                arr[i] = 0;
                            } else if (cnt1 > 0) {
                                cnt1--;
                                arr[i] = 1;
                            }
                        } else if (cnt0 > 1) {
                            cnt0 -= 2;
                            arr[i] = 0;
                            arr[n - i - 1] = 0;
                        } else if (cnt1 > 1) {
                            cnt1 -= 2;
                            arr[i] = 1;
                            arr[n - i - 1] = 1;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if (!flag || cnt0 < 0 || cnt1 < 0) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }

        }

    }

}
