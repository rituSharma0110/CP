package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1324B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n= scanner.nextInt();
            int[] array = new int[n];
            for (int i=0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            boolean flag = false;
          out:  for (int i =0;i<n;i++){
                for (int j =i+1;j<n;j++){
                    if (array[i]== array[j]){
                        if (Math.abs(j-i)>=2){
                            flag = true;
                            break out;

                        }
                    }
                }
            }

            System.out.println(flag? "YES" : "NO");
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
