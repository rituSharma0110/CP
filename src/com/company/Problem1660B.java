package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1660B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            Long [] array = new Long[size];
            for (int i =0;i< array.length;i++){
                array[i]= scanner.nextLong();
            }
            if (size==1){
                if(array[0]==1) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
                continue;
            }
            Arrays.sort(array);
            if (array[size-1]-array[size-2]>=2){
                System.out.println("NO");
            }else System.out.println("YES");

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
