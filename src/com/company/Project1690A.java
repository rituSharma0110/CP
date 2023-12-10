package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Project1690A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
 out:       while (tc-->0){
            int n = scanner.nextInt();
            int [] arrayA = new int[n];
            int [] arrayB = new int[n];
            for (int i =0;i<n;i++){
                arrayA[i] = scanner.nextInt();
            }
            for (int i =0;i<n;i++){
                arrayB[i] = scanner.nextInt();

            }
             int diff = 0 ;
             for (int i = 0; i <n ; i++) {
                 if (arrayA[i] < arrayB[i]){
                     System.out.println("NO");
                     continue out;
                 }
                 diff = Math.max(diff , arrayA[i] - arrayB[i] ) ;
             }
             for (int i = 0; i <n ; i++) {
                 arrayA[i] = Math.max(0 , arrayA[i] - diff) ;
                 if (arrayA[i] != arrayB[i]){
                     System.out.println("NO");
                     continue out;
                 }
             }
             System.out.println("YES");
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
