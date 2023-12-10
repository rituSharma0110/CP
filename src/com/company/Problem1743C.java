package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1743C {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            char [] chars = scanner.next().toCharArray();
            int [] array = new int[n];
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            int val =0;
            int ans =0;
            for (int i =0;i<n;i++){
                if (chars[i]=='1'){
                    if(val>array[i]){
                       ans+=val;
                        chars[i]='0';
                    }else {
                        ans+= array[i];
                    }
                }
                if(chars[i]=='0'){
                  val=array[i];

                }
            }
            System.out.println(ans);
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
