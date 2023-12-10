package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1760D {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int [] array = new int[length];
            for (int i =0;i<length;i++){
                array[i] = scanner.nextInt();
            }
            int inc = 0;
            int dec = 0;
            boolean isPossible = false;
            for (int i =0;i<length-1;i++){
                if (array[i]<array[i+1]){
                    inc ++;
                }else if(array[i]>array[i+1]){
                    dec++;
                    if(inc >0 ){
                         isPossible = true;
                    }
                }
            }
            System.out.println(!isPossible? "YES" : "NO");
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
