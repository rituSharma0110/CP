package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1185B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc  = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            String pattern = scanner.next();
            int i =0;
            int j =0;
            boolean flag = true;
            while (j<pattern.length()){
                if (i<str.length() && pattern.charAt(j)==str.charAt(i)){
                    i++;
                }else if (j>0 && pattern.charAt(j)==str.charAt(i-1)){

                }else {
                    flag = false;
                    break;
                }
                j++;
            }

            if (flag && i==str.length()){
                System.out.println("YES");
            }else System.out.println("NO");


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
