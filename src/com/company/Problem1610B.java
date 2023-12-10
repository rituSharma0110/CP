package com.company;


import java.io.*;
import java.util.StringTokenizer;

public class Problem1610B {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException{
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
           for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
           }
           int i =0;
           int j = n-1;
            boolean flag = true;
           while (i<j){
               if (array[i]==array[j]){
                   i++;
                   j--;
               }else {
                  flag = isKalindrome(array,array[i]) || isKalindrome(array,array[j]);
                  break;
               }
           }
           out.println(flag?"YES":"NO");


        }

        out.close();


    }
    static boolean isKalindrome (int [] array, int val){
        int i =0;
        int n = array.length;
        int j =n-1;
        while (i<j){
            if (array[i]==val ){
                i++;
            }else if (array[j]==val){
                j--;
            }else if (array[i]!=array[j]){
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
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
