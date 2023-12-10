package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Problem1734C {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String [] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0) {
            int n = scanner.nextInt();
            String str = scanner.next();

            boolean []visited = new boolean[n];
            long ans =0;
            for (int i =1;i<=n;i++){
                for (int j=i;j<=n;j+=i){

                    if (str.charAt(j-1)=='1'){
                        break;
                    }

                    if (!visited[j-1]){
                        ans+=i;
                        visited[j-1]= true;
                    }
                }
            }

            out.println(ans);
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
