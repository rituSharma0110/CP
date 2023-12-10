package com.company;
import java.io.*;
import java.util.*;

public class Problem1656B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int k = scanner.nextInt();
            Integer [] array = new Integer[length];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            boolean isPossible = false;
            Set<Integer> set = new HashSet<>(Arrays.asList(array));
            for (int i =0;i< length;i++){
                if (set.contains(array[i]+k)){
                    isPossible = true;
                    break;
                }
            }


            System.out.println(isPossible ? "YES" : "NO");
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
