package com.company;
import java.io.*;
import java.util.*;

public class Project1413B {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] row =new int[n*m+1];
            int[] col =new int[n*m+1];
            for(int i =0;i<n;i++) {
                for(int j =0;j<m;j++) {
                    int x= scanner.nextInt();
                    col[x]=j;
                }
            }
            for(int i =0;i<m;i++) {
                for(int j =0;j<n;j++) {
                    int x= scanner.nextInt();
                    row[x]=j;
                }
            }
            int[][] ans =new int[n][m];
            for(int i=1;i<=n*m;i++) {
                ans[row[i]][col[i]]= i;
            }
            for(int i =0;i<n;i++) {
                for(int j =0;j<m;j++) {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
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
