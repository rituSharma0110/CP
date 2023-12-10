package com.company;
import java.util.*;

public class Problem1619C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            long a = scanner.nextLong();
            long s = scanner.nextLong();

            ArrayList<Integer>ans=new ArrayList<>();
            while(s>0) {
                if(a>s){
                    break;
                }
                int p=(int)(a%10);
                int q=(int)(s%10);
                if(q>=p) {
                    ans.add(0,q-p);
                    a/=10;
                    s/=10;
                }
                else {
                    q=(int)(s%100);
                    if(q>=p+10){
                        break;
                    }

                    if(q<p){
                        break;
                    }
                    ans.add(0,q-p);
                    a/=10;
                    s/=100;

                }

            }
            if(s>0){
                System.out.println(-1);

            }
            else {
                long val = 0;
                for (int i : ans) {
                    val *= 10;
                    val += i;
                }

                System.out.println(val);
            }
        }
    }
}
