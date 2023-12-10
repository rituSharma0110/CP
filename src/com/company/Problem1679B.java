package com.company;
import java.io.*;
import java.util.*;

public class Problem1679B {
    static Scanner scanner = new Scanner(System.in);
     static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int [] array = new int[n];
        long sum = 0;
        for (int i =0;i<n;i++){
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        int [] nArray = new int[n];
        int k =0;
        int val=-1;
        while (q-->0){
            int a = scanner.nextInt();
            if (a==1 ){
                int index = scanner.nextInt();
                index-=1;
                int b = scanner.nextInt();
                if (nArray[index]!=k){
                    nArray[index]=k;
                    array[index]=val;
                    sum = sum- array[index]+b;
                    array[index] = b;
                }else {
                    sum -= array[index ];
                    sum+=b;
                    array[index]=  b;
                }
                out.println(sum);

            }else {
                int b = scanner.nextInt();
                val=b;
                sum= (long)val*n;
                out.println(sum);
                k++;

            }
        }
        out.flush();

    }
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
