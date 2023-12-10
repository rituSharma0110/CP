package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1646B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            Long [] array = new Long[size];
            for (int i =0;i< array.length;i++){
                array[i]= scanner.nextLong();
            }
            Arrays.sort(array);
            long sumR= array[array.length-1];
            long sumB = array[0]+ array[1];
            if (sumB<sumR){
                System.out.println("YES");
            }else {
                for (int j = 2; j <= size/ 2; j++) {
                    sumR += array[size - j];
                    sumB += array[j];
                    if (sumB < sumR) {
                        break;
                    }
                }
                if (sumB < sumR)  {
                    System.out.println("YES");
                }
                else  {
                    System.out.println("NO");
                }
            }

        }
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader s) throws FileNotFoundException {
            br = new BufferedReader(s);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}
