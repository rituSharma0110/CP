package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem1227B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
   out:     while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<>();
            int k =1;
            int cnt =0;
            for (int i =0;i<n;i++){
                k++;
                if (array[i]!=k){
                    list.add(k);
                    cnt++;
                }
            }
            int l = 0;
            if (cnt>0) {
                for (int i = 0; i < n - 1; i++) {
                    if (array[i] == array[i + 1] && cnt > 0) {
                        System.out.print(list.get(l++)+ " ");
                        cnt--;
                    } else if (cnt == 0) {
                        System.out.println(-1);
                    } else System.out.print(array[i] + " ");
                }
                System.out.println();
            }else if (cnt==0){
                for (int i =0;i<n;i++){
                    System.out.print(array[i]+ " ");
                }
                System.out.println();
            }else System.out.println(-1);
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
