package com.company;
import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Problem1433D {
    public static Scanner scanner = new Scanner(System.in);
    static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String [] args) throws IOException{
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            int var = array[0];
            boolean flag = true;
            for (int i =0;i<n;i++){
                if (var != array[i])
                    flag = false;
            }
            int min = Integer.MAX_VALUE;
            for (int i =0;i<n;i++){
                min = Math.min(min, array[i]);
            }

            if (flag){
                out.println("NO");
            }else {
                out.println("YES");
                boolean[] visited = new boolean[n];
                visited[0] = true;
                for (int i = 1; i < n; i++) {
                    if (array[i] != array[0]) {
                        out.println(1 + " " + (i + 1));
                        visited[i] = true;
                    }
                }
                for (int i = 0; i < array.length; i++) {
                    if (!visited[i]) {
                        for (int j = 0; j < array.length; j++) {
                            if (array[j] != array[i]) {
                                out.println((i + 1) + " " + (j + 1));
                                break;
                            }
                        }
                    }
                }
            }
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
