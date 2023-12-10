package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem1744D {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            long [] array = new long[length];
            int twos = 0;
            for (int i =0;i<length;i++){
                array[i] = scanner.nextInt();
                long val = array[i];
                while (val%2==0 ){
                    twos++;
                    val/=2;
                }
            }
            if(twos >= length){
                System.out.println(0);
                continue;
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int i =2;i<=length;i+=2){
                int cnt =0;
                int index =i;
                while (index%2==0 ){
                    cnt++;
                    index/=2;
                }
                list.add(cnt);
            }
            list.sort(Collections.reverseOrder());
            int res =0;
            for (int i =0;i<list.size();i++){
                twos+= list.get(i);
                res++;
                if(twos>=length){
                    break;
                }
            }
            if (twos<length){
                System.out.println(-1);
                continue;
            }
            System.out.println(res);


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
