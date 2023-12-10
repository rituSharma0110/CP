package com.company;
import java.io.*;
import java.util.*;

public class Problem1537C {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            Integer [] array = new Integer[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            int a = 0;
            int b = 1;
            int diff = Math.abs(array[a]-array[b]);
            for (int i = 1;i<size-1;i++){
                if (diff>array[i+1]- array[i] ){
                    diff = Math.abs(array[i]- array[i+1]);
                        a = i;
                        b = i+1;
                }
            }
            out.print(array[a] + " ");
            for (int i =b+1;i<size;i++){
                out.print(array[i] + " ");
            }
            for (int i =0;i<a;i++){
                out.print(array[i] + " ");
            }
            out.println(array[b]);


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
