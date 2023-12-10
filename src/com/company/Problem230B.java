package com.company;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Problem230B {
    public static Scanner scanner = new Scanner(System.in);
   public static Set<Long> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        div();
        while (tc-->0) {
            long a = scanner.nextLong();
            if (set.contains(a)){
                System.out.println("YES");
            }else System.out.println("NO");
        }

    }
    static void div(){
        int [] array = new int[(int) 1e6+10];
        set.add(4L);
        for (int i =3;i<=(int)1e6+1;i+=2){
            if (array[i]==0) {
                set.add(((long) i * i));
                for (int j = i;j<=1e6;j+=i){
                    array[j]=1;
                }
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
