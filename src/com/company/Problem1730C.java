package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1730C {
    static Scanner scanner =  new Scanner(System.in);
    static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            int []numbers = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                numbers[i] = str.charAt(i) - '0';
            }
            int min = numbers[numbers.length-1];
            for (int i = numbers.length-2;i>=0;i--){
                if (numbers[i]>min){
                    if (numbers[i]!=9) {
                        numbers[i] = numbers[i] + 1;
                    }
                }else {
                    min = numbers[i];
                }
            }
            Arrays.sort(numbers);
            for (int i =0;i<numbers.length;i++){
                out.print(numbers[i]);
            }
            out.println();
            out.flush();
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
