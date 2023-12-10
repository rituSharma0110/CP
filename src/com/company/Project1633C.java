package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Project1633C {
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  throws IOException{
        int tc = scanner.nextInt();
       while (tc-->0){
             long hc = scanner.nextLong();
             long dc = scanner.nextLong();
             long hm = scanner.nextLong();
             long dm = scanner.nextLong();
             long k = scanner.nextLong();
             long w = scanner.nextLong();
             long a = scanner.nextLong();
             boolean isPossible = false;
            for (int i =0;i<=k;i++) {
                long hc1 = a*i + hc;
                long dc1 = w*(k-i) + dc;
                if ((hc1+dm-1)/dm>= (hm+dc1-1)/dc1){
                    isPossible = true;
                    break ;
                }
            }
         out.println(isPossible?"YES":"NO");

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
