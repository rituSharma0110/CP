package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1738B {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
      outer:  while (tc-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int [] array = new int[k];
            for (int i =0;i<k;i++){
                array[i] = scanner.nextInt();
            }
            if (k==1){
                System.out.println("YES");
                continue ;
            }
            int firstNum =array[0];
            for (int i =0;i<k-1;i++){
                int lastNum = array[i+1]-array[i];
                if (lastNum<firstNum){
                    System.out.println("NO");
                    continue outer;
                }
                firstNum = lastNum;
            }
            long val = (long) (n - k + 1) *(array[1]-array[0]);
            if (val>=array[0]){
                System.out.println("YES");
                continue ;
            }
            System.out.println("NO");


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
