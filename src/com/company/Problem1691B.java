package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Problem1691B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
                map.put(array[i], map.getOrDefault(array[i], 0) +1);
            }
            boolean isPossible = false;
            for(int val:map.values()) {
                if(val == 1){
                    isPossible = true;
                    break;
                }
            }
            if (isPossible){
                System.out.println(-1);
            }else {
                int[] ans = new int[n];
                for (int i = 0; i < n; i++) {
                    ans[i] = i;

                }
                for (int i = 0; i < n; i++) {
                    if(i<n-1){
                        if(array[i] == array[i+1]){
                            int temp = ans[i];
                            ans[i] = ans[i+1];
                            ans[i+1] = temp;
                        }
                    }
                    System.out.print((ans[i] + 1) + " ");
                }
            }
            System.out.println();
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
