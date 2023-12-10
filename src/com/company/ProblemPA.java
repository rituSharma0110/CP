package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ProblemPA {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {

        int [] arrays = new int[2];

        String string1 = scanner.next();
        String[] strs = string1.split("\\s+");

        for (int i = 0; i < strs.length; i++) {
            arrays[i] = Integer.parseInt(strs[i]);
        }
        int [] array = new int[arrays[0]];
        int k = arrays[1];
        int [] freq = new int[1000000];
       String string2 = scanner.next();
        String[] strs1 = string2.split("\\s+");

        for (int i = 0; i < strs1.length; i++) {
            array[i] = Integer.parseInt(strs1[i]);
            freq[array[i]]++;
        }

        Arrays.sort(freq);
        int count =1;
        for (int i = freq.length-1;i>=0;i--){
            k-= freq[i];
            count++;
            if(k<=0){
                break;
            }
        }
        out.println(count);
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
