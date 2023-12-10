package com.company;

import java.io.*;
import java.util.*;

public class Problem1132B {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int length = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        long sum =0;
        for (int i =0;i<length;i++){
            int x = scanner.nextInt();
            sum+=x;
            list.add(x);
        }
        list.sort(Collections.reverseOrder());
        int n = scanner.nextInt();
        for (int i =0;i<n;i++){
            int k = scanner.nextInt();
            out.println(sum - list.get(k-1));
        }


        out.flush();
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
