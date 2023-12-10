package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ProblemPP1 {
    static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String str = scanner.next();
        char [] array = str.toCharArray();

        Arrays.sort(array);

        StringBuilder res = new StringBuilder();
        for (int l =0;l< array.length;l++){
            res.append(array[l]);
        }
        res.reverse();
        for (int l =0;l<res.length();l++){
            int count = 1;
            while (l + 1 < res.length()
                    && res.charAt(l)== res.charAt(l + 1)) {
                l++;
                count++;
                if (count==k){
                    res.append(res.charAt(l));
                    res.deleteCharAt(l);

                }else {

                }

            }
        }
        out.print(res);
        out.flush();

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
