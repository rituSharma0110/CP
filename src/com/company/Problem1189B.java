package com.company;
import java.io.*;
import java.util.*;

public class Problem1189B {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];
        for (int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        if (array[n-1] >= (array[n-2] + array[n-3])){
            System.out.println("NO");
        }else {
            System.out.println("YES");
            for (int i =0;i<n-2;i++){
                System.out.print(array[i]+ " ");
            }
            System.out.print(array[n-1] + " ");
            System.out.println(array[n-2]);
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
