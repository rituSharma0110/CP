package com.company;
import java.io.*;
import java.util.*;


public class Problem1638B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i<n;i++){
                array[i]  = scanner.nextInt();
            }
            ArrayList<Integer> oddList = new ArrayList<>();
            ArrayList<Integer> evenList = new ArrayList<>();

            for (int i =0;i<n;i++){
                if(array[i]%2==0){
                    evenList.add(array[i]);
                }else oddList.add(array[i]);
            }
            if (isSortedList(evenList) && isSortedList(oddList)) {
                System.out.println("YES");
            } else System.out.println("NO");


        }

    }
    public static boolean isSortedList(ArrayList<Integer> a) {
        boolean yes = true;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) < a.get(i - 1)) {
                yes = false;
            }
        }
        return yes;
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
