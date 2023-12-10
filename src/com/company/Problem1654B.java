package com.company;


import java.io.*;
import java.util.StringTokenizer;

public class Problem1654B {
    public static Scanner scanner = new Scanner(System.in);
//    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
      out:  while (tc-->0){
            String str = scanner.next();
            int[] cnt = new int[26];
              for (int i = 0; i < str.length(); i++)
                  cnt[str.charAt(i) - 'a']++;
              int i = 0;
              for (i = 0; i < str.length(); i++) {
                  char ch = str.charAt(i);
                  if (cnt[ch - 'a'] > 1)
                      cnt[ch - 'a']--;
                  else break;
              }
              System.out.println(str.substring(i, str.length()));
          }
//        out.flush();
//        out.close();
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
