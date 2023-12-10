package com.company;

import java.io.*;
import java.util.*;

public class Problem1686C {
    static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
    out:    while (tc-- > 0) {
            int n = scanner.nextInt();
            Integer[] array = new Integer[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            Arrays.sort(array);
            Integer[] newArray = new Integer[n];
            int j = 0;
            for(int i = 0; i<n; i+=2) {
                newArray[i] = array[j++];
            }
            for(int i = 1; i<n; i+=2) {
                newArray[i] = array[j++];
            }
            for (int i = 0; i < n; i++) {
                if ((newArray[i] > newArray[(i - 1 + n) % n] && newArray[i] > newArray[(i + 1) % n]) || (newArray[i] < newArray[(i - 1+n) % n] && newArray[i] < newArray[(i + 1) % n])) {
                   continue;
                }else {
                    out.println("NO");
                    continue out;
                }
            }

            out.println("YES");
            for (int i = 0; i < n; i++) {
                out.print(newArray[i] + " ");
            }
            out.println();

        }
        out.close();

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
