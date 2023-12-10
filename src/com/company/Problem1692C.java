package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1692C {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while(tc-->0) {
            int x = -1, y = -1;
            String ans = "";
            for (int i = 0; i < 8; i++) {
                String str = scanner.next();
                if (ans.equals("")) {
                    int c = 0;
                    for (int j = 0; j < str.length(); j++) {
                        if (str.charAt(j) == '#') {
                            c++;
                            if (c == 1){
                                x = j;
                            }
                            else{
                                y = j;
                            }
                        }
                    }
                    if (c == 2) {
                        float p = y - x - 1;
                        ans = (i + (int) Math.ceil(p / 2) + 1) + " " + ((x + y) / 2 + 1);
                    }
                }
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
