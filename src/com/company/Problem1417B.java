package com.company;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Problem1417B {
    static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i<n;i++){
                array[i]= scanner.nextInt();
            }
            boolean isMarked = true;
            if (k%2==1){
                for (int i =0;i<n;i++){
                    if (array[i]<=k/2) out.print(1 + " ");
                    else out.print(0+ " ");
                }
            }else {
                for (int i =0;i<n;i++) {
                    if (array[i]<k/2) out.print(1 + " ");
                   else if (array[i]>k/2) out.print(0 + " ");
                   else {
                        if(isMarked)
                            out.print(1 + " ");
                        else
                            out.print(0 + " ");
                        isMarked = !isMarked;
                    }
                }
            }out.println();


        }
        out.close();
    }
}
