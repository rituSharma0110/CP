package com.company;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Problem771A {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();

            }
            int [] newArray = array.clone();
            Arrays.sort(newArray);
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i =0;i< array.length;i++){
                if (array[i]!= newArray[i]){
                     min = Math.min(min,i);
                     max = Math.max(max,i);
                }
            }
            for (int i =min;i<=max;i++){
                swap(array,min,max);
            }
//            Map<Integer, Integer> m = new HashMap<>();
//            for (int i = 0; i < size; i++) m.put(array[i], i);
//            for (int i = 0; i < size; i++) {
//                if (array[i] != i + 1) {
//                    int j = m.get(i + 1);
//                    for (int p = i, q = j; p < q; p++, q--) {
//                        swap(array, p, q);
//                    }
//                    break;
//                }
//            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }


//    static class Scanner {
//        StringTokenizer st;
//        BufferedReader br;
//
//        public Scanner(InputStream s) {
//            br = new BufferedReader(new InputStreamReader(s));
//        }
//
//        public Scanner(FileReader s) throws FileNotFoundException {
//            br = new BufferedReader(s);
//        }
//
//        public String next() throws IOException {
//            while (st == null || !st.hasMoreTokens())
//                st = new StringTokenizer(br.readLine());
//            return st.nextToken();
//        }
//
//        public int nextInt() throws IOException {
//            return Integer.parseInt(next());
//        }
//
//        public long nextLong() throws IOException {
//            return Long.parseLong(next());
//        }
//
//        public String nextLine() throws IOException {
//            return br.readLine();
//        }
//
//        public double nextDouble() throws IOException {
//            return Double.parseDouble(next());
//        }
//
//        public boolean ready() throws IOException {
//            return br.ready();
//        }
//
//    }
}
