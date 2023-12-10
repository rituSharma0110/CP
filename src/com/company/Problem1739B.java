package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1739B {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i< array.length;i++){
                array[i]= scanner.nextInt();
            }

            boolean isPossible = true;
            array[0]= array[0];
            for (int i =1;i<n;i++){
                if (array[i]>0 && array[i]<= array[i-1]){
                    isPossible= false;
                    break;
                }
                array[i]= array[i]+ array[i-1];
            }
            if (isPossible){
                for (int i =0;i< array.length;i++){
                    out.print(array[i] + " ");
                }
                out.println();
            }else out.println(-1);

            out.flush();
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
