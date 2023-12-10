package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem1454C {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            long [] array = new long[n];

            Map<Long, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextLong();
                if (i == 0 || array[i] != array[i - 1]) {
                    if (map.containsKey(array[i])) {
                        map.put(array[i], map.get(array[i]) + 1);
                    } else {
                        map.put(array[i], 1);
                    }
                }
            }

            long ans = Long.MAX_VALUE;
            for (Long key : map.keySet()) {
                int cnt = map.get(key) + 1;
                if (array[0] == key){
                    cnt--;
                }
                if (array[n - 1] == key){
                    cnt--;
                }
                ans = Math.min(cnt, ans);
            }
            System.out.println(ans);
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
