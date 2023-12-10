package com.company;
import java.io.*;
import java.util.*;

public class Problem1598C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int [] array = new int[length];
            long sum = 0;
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
                sum +=array[i];
            }
                sum *= 2;
                Map<Long, Integer> map = new HashMap<>();
                long res = 0;
                for (int i = 0; i < length; i++) {
                    long target = sum - (long) length * array[i];
                    res += map.getOrDefault(target, 0);
                    map.put((long) ((long) length * array[i]), map.getOrDefault((long)length* array[i], 0) + 1);
                }
                System.out.println(res);

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
