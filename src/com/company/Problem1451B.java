package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1451B {
    public static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int q = scanner.nextInt();
            String str = scanner.next();
            char [] array = str.toCharArray();
            while (q-->0){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                char [] newArray = new char[b-a+1];
                int j =0;
                for (int i =a-1;i<=b-1;i++){
                    newArray[j] = array[i];
                    j++;
                }
                boolean isPossible = false;
               for (int i = b;i< array.length;i++){
                   if (newArray[newArray.length-1]==array[i]){
                       isPossible= true;
                   }
               }
                for (int i = 0;i<a-1;i++){
                    if (newArray[0]==array[i]){
                        isPossible= true;
                    }
                }
               if (isPossible){
                   System.out.println("YES");
               }else System.out.println("NO");

            }
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
