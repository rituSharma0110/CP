package com.company;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem1624C {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            HashSet<Integer> set = new HashSet<>();
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            for (int i =0;i<n;i++){
                while (array[i]>n ){
                    array[i]/=2;
                }
                if (array[i]<=n){
                    while (set.contains(array[i]) && array[i]>0){
                        array[i]/=2;
                    }
                    if (!set.contains(array[i]) && array[i]>0){
                        set.add(array[i]);
                    }
                }
            }
            if (set.size()==n){
                out.println("YES");
            }else out.println("NO");
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
