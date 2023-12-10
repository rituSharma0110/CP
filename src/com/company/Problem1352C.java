package com.company;
import java.util.*;

public class Problem1352C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            char[] charArray = scanner.next().toCharArray();
            StringBuilder sbr = new StringBuilder();
            int count = 0;
            for (int i = 0;i<charArray.length;i++) {
                char digit = charArray[i];
                if (digit != '0') {
                    count++;
                    sbr.append(" ");
                    sbr.append(digit);
                    for (int j = i + 1;j<charArray.length;j++) {
                        sbr.append('0');
                    }
                }
            }
            System.out.println(count);
            System.out.println(sbr.substring(1));
        }

    }
}
