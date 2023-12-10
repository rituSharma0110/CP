package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1616B {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int n = scanner.nextInt();
            String str = scanner.next();
            StringBuilder sbr = new StringBuilder("");
            if(n==1){
                out.println(str.charAt(0)+"" + str.charAt(0));
                continue;

            }

            if (str.charAt(0)==str.charAt(1)){
                out.println(str.charAt(0)+"" + str.charAt(0));
                continue;
            }
            int index = 1;
            for (int i = 0; i < n - 1; i++) {
                if (str.charAt(i) >= str.charAt(i + 1)) {
                    index++;
                }else break;
            }
            for (int i =0;i<index;i++){
                sbr.append(str.charAt(i));
            }
            StringBuilder res = new StringBuilder(sbr);
            sbr.reverse();
            res.append(sbr);
            out.println(res);
        }
        out.close();

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
