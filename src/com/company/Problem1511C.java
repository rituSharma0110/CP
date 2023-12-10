package com.company;

import java.io.*;
import java.util.*;

public class Problem1511C {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
           int size1 = scanner.nextInt();
           int size2 = scanner.nextInt();
           int [] card = new int[size1];
           int [] query = new int[size2];
           ArrayList<Integer> list = new ArrayList<>();
           for (int i =0;i<size1;i++){
               card[i] = scanner.nextInt();
           }
            for (int i =0;i<query.length;i++){
                query[i]=scanner.nextInt();
            }
        for(int i = 0; i < size2; i++) {
            for(int j = 0; j < size1; j++) {
                if(card[j] == query[i]) {
                    list.add(j+1);
                    rotateArray(card, j);
                    break;
                }
            }
        }


        for (int i =0;i<list.size();i++){
                out.print(list.get(i)+ " ");
            }out.println();
        out.flush();
        out.close();
    }
    static void rotateArray(int [] array , int ind){
        int temp = array[ind];
        for (int i = ind;i>0;i--){
            array[i] = array[i-1];
        }
        array[0] = temp;
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
