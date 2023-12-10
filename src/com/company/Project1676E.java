package com.company;
import java.io.*;
import java.util.*;

public class Project1676E {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            Integer [] array = new Integer[n];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array,Collections.reverseOrder());

            int [] prefSum = new int[n];
            prefSum[0] = array[0];
            for (int i =1;i< array.length;i++){
                prefSum[i]=(prefSum[i-1] + array[i]);
            }
            for (int i =0;i<q;i++){
                int val = scanner.nextInt();
                int ans =-1;


                int start = 1;
                int end = n;
                while (start<=end){
                    int mid = (start+end )/2;

                    if (val<=prefSum[mid-1]){
                        end=mid-1;
                        ans = mid;

                    }else {
                        start = mid+1;
                    }
                }  System.out.println(ans);

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
