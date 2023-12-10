package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1688B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
           int n= scanner.nextInt();
           int [] array = new int[n];
           int cntO=0;
           for (int i =0;i<n;i++){
               array[i] = scanner.nextInt();
               if (array[i]%2!=0){
                   cntO++;
               }
           }
           if (cntO>0){
               System.out.println(n-cntO);
               continue;
           }

           int min = Integer.MAX_VALUE;
           for (int i =0;i<n;i++){
               int steps =0;
               while (array[i]%2==0){
                   array[i]/=2;
                   steps++;
               }
               min = Math.min(steps,min);
           }
            System.out.println(min+n-1);




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
