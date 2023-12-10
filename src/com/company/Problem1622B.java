package com.company;

import java.io.*;
import java.util.*;

public class Problem1622B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i]= scanner.nextInt();
            }
            String str = scanner.next();
            List<Integer> like=new ArrayList<>();
            List<Integer> dislike=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (str.charAt(i) == '1'){
                    like.add(array[i]);
                }
                else{
                    dislike.add(array[i]);
                }
            }
            Collections.sort(like);
            Collections.sort(dislike);
            Map<Integer,Integer> likepos=new HashMap<>();
            Map<Integer,Integer> dislikepos=new HashMap<>();
            int count=1;
            for (int i = 0; i < dislike.size(); i++) {
                dislikepos.put(dislike.get(i),count);
                count++;
            }
            for (int i = 0; i < like.size(); i++) {
                likepos.put(like.get(i),count);
                count++;
            }
            for (int i = 0; i < size; i++) {
                if(str.charAt(i)=='1'){
                    System.out.print(likepos.get(array[i])+" ");
                }
                else {
                    System.out.println(dislikepos.get(array[i])+" ");
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
