package com.company;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem1703D {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            HashSet<String> set = new HashSet<>();
            String [] array = new String[n];
            for (int i =0;i<n;i++){
                array[i] = scanner.next();
                set.add(array[i]);
            }
            Character [] charArray = new Character[n];
            for (int i =0;i<n;i++){
                charArray[i] = '0';
                for (int j =1 ;j<array[i].length();j++){
                    if (set.contains(array[i].substring(0,j))  && set.contains(array[i].substring(j))){
                        charArray[i]='1';
                    }
                }
            }
            for (int i =0;i<charArray.length;i++){
                System.out.print(charArray[i]);
            }
            System.out.println();
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
