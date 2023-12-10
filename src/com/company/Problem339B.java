package com.company;
import java.io.*;
import java.util.*;

public class Problem339B {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int l = scanner.nextInt();
        int k = scanner.nextInt();
        int [] array = new int[k];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        long ans =0;
        long cnt = array[0]-1;
        for (int i =1;i< array.length;i++){
            if (array[i]>=array[i-1]){
                cnt+= array[i]- array[i-1];
            }else {
                ans+=cnt;
                cnt=l- array[i-1]+ array[i];
            }
        }
        ans+=cnt;
        out.println(ans);



        out.flush();
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
