package com.company;
import java.util.*;

public class Problem1658A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0) {
            ArrayList<Integer> list=new ArrayList<>();
            int length= scanner.nextInt();
            String str= scanner.next();
            for(int i=0;i<length;i++) {
                if(str.charAt(i)=='0')
                    list.add(i);

            }
            int ans=0;
            if(list.size()==1 && length==1) {
                System.out.println(0);
            } else {
                for (int i = 1; i < list.size(); i++) {
                    int count = list.get(i) - list.get(i - 1);
                    ans = ans + Math.max(3 - count, 0);
                }
                System.out.println(ans);
            }

        }

    }
}
