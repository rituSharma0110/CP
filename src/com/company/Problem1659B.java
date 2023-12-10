package com.company;

import java.util.Scanner;

public class Problem1659B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            if (s.charAt(0) != '?') {
                StringBuilder sb = new StringBuilder("" + s.charAt(0));
                for (int i = 1; i<n;i++) {
                    if (s.charAt(i) !='?') {
                        sb.append(s.charAt(i));
                    } else {
                        if (sb.charAt(i-1)=='B') {
                            sb.append('R');
                        } else {
                            sb.append('B');
                        }
                    }
                }
                System.out.println(sb);
                continue;
            }

            StringBuilder sb = new StringBuilder("R");
            for (int i = 1; i<n;i++) {
                if (s.charAt(i)!='?') {
                    sb.append(s.charAt(i));
                } else {
                    if (sb.charAt(i-1) =='B') {
                        sb.append('R');
                    } else {
                        sb.append('B');
                    }
                }
            }

            StringBuilder sb2 = new StringBuilder("B");
            for (int i = 1; i < n; i++) {
                if (s.charAt(i)!='?') {
                    sb2.append(s.charAt(i));
                } else {
                    if (sb2.charAt(i-1)=='B') {
                        sb2.append('R');
                    } else {
                        sb2.append('B');
                    }
                }
            }

            if (count(sb) < count(sb2)) {
                System.out.println(sb);
            } else {
                System.out.println(sb2);

            }

        }
    }

    public static int count(StringBuilder sb) {
        int count = 0;
        for(int i = 1; i < sb.length(); i++) {
            if(sb.charAt(i) == sb.charAt(i-1))
                count++;
        }
        return count;
    }
}
