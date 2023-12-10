package com.company;
import java.io.*;
import java.util.*;

public class Problem1095B {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int size = scanner.nextInt();
        Long [] array = new Long[size];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextLong();

        }
        // 1 7 8 9 --> removing 1 would be efficient
        Arrays.sort(array);
        long max1 = array[size-2];
        long min1 = array[0];
        long max2 = array[size-1];
        long min2 = array[1];
        long minimum = Math.min(max1-min1, max2- min2);
        out.println(minimum);
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
