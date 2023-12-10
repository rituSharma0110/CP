package com.company;
import java.io.*;
import java.util.StringTokenizer;

public class Problem1661A {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int size = scanner.nextInt();
            int[] array1 = new int[size];
            int[] array2 = new int[size];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = scanner.nextInt();
            }

            for (int i = 0; i < array1.length; i++) {
                array2[i] = scanner.nextInt();
            }
            long sum = 0;
            for (int i = 0; i < array1.length-1; i++) {
                sum += Math.min((Math.abs(array1[i]- array1[i+1]) + Math.abs(array2[i]- array2[i+1])),
                        (Math.abs(array1[i]- array2[i+1]) + Math.abs(array2[i]- array1[i+1])));
            }
            out.println(sum);
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
