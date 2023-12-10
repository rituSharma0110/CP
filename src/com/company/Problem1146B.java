package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1146B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String str = scanner.next();
        StringBuilder sbr = new StringBuilder("");
        for (int i =0;i<str.length();i++){
            if (str.charAt(i)!='a'){
                sbr.append(str.charAt(i));
            }
        }
        if (sbr.length()==0){
            System.out.println(str);

        }else {

            int n = sbr.length();

            boolean isPossible= true;
            if (!sbr.substring(0, sbr.length() / 2).equals(sbr.substring(sbr.length() / 2, sbr.length()))) {
                isPossible= false;
            }
            for (int i = str.length() - sbr.length() / 2, j = 0; i < str.length(); i++, j++) {
                if (str.charAt(i) != sbr.charAt(j)) {
                    isPossible= false;
                }
            }

            if (isPossible){
                System.out.println(str.substring(0, str.length() - sbr.length() / 2));
            }else if (n%2!=0){
                System.out.println(":(");
            }else System.out.println(":(");
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
