package com.company;
import java.io.*;
import java.util.*;

public class Problem1675B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            boolean isPossible = true;
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
                if(i!=0){
                   if(  array[i]==0 ){// always go through each line of PS
                       isPossible = false;
                   }
                }

            }
            if (!isPossible){
                System.out.println("-1");
                continue;
            }
            int cnt =0;
            for (int i = array.length-1;i>=1;i--){
                if (array[i]<=array[i-1]){
                    while (array[i]<=array[i-1]){
                        array[i-1]/=2;
                        cnt++;
                    }
                    if (i!=1) {
                        if (array[i] == 1) {
                            isPossible = false;
                            break;

                        }
                    }
                }
            }
            if (!isPossible){
                System.out.println(-1);
            }else
            System.out.println(cnt);

        }
    }

//    static int powOf2(int a){
//
//    }
//    static class Scanner {
//        StringTokenizer st;
//        BufferedReader br;
//
//        public Scanner(InputStream s) {
//            br = new BufferedReader(new InputStreamReader(s));
//        }
//
//        public Scanner(FileReader s) throws FileNotFoundException {
//            br = new BufferedReader(s);
//        }
//
//        public String next() throws IOException {
//            while (st == null || !st.hasMoreTokens())
//                st = new StringTokenizer(br.readLine());
//            return st.nextToken();
//        }
//
//        public int nextInt() throws IOException {
//            return Integer.parseInt(next());
//        }
//
//        public long nextLong() throws IOException {
//            return Long.parseLong(next());
//        }
//
//        public String nextLine() throws IOException {
//            return br.readLine();
//        }
//
//        public double nextDouble() throws IOException {
//            return Double.parseDouble(next());
//        }
//
//        public boolean ready() throws IOException {
//            return br.ready();
//        }
//    }
}
