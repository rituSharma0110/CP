package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1697B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  throws IOException{
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        Integer [] array = new Integer[n];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        long newArray[]=new long[n+1];
        newArray[0]=0;
        for(int i=1;i<=n;i++)
        {
            newArray[i]=newArray[i-1]+array[i-1];
        }
        for(int j=0;j<q;j++)
        {
            int total=scanner.nextInt();
            int c=scanner.nextInt();
            System.out.println((newArray[n-total+c])-(newArray[n-total]));
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
