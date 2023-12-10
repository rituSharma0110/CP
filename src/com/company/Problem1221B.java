package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1221B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
            int n = scanner.nextInt();
            StringBuilder sbr = new StringBuilder("");
            for (int i =0;i<n;i++){
                for (int j =0;j<n;j++){
                    if((i+j)%2==0){
                        sbr.append('W');
                    }else{
                        sbr.append('B');
                    }
                }sbr.append("\n");
            }
        System.out.println(sbr);

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
