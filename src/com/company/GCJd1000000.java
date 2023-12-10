package com.company;

import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class GCJd1000000 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        int t = 1;
        for (t = 1 ; t<=tc; t++){
            System.out.println("Case #" + t + ": ");
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            for (int i =1;i<=2*r+1;i++){
                for (int j =1 ;j<=2*c+1;j++){
                    if (j<=2 && i<=2){
                        System.out.print(".");
                    }else if (i%2!=0 ){
                        if (j%2!=0){
                            System.out.print("+");
                        }else {
                            System.out.print("-");
                        }
                    }else if (i%2==0  ){
                        if (j%2!=0){
                            System.out.print("|");
                        }else {
                            System.out.print(".");
                        }
                    }
                }
                System.out.println();
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
