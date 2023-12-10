package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Project1166B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int n = scanner.nextInt();
        sieve(number);
        if (set.contains(n) || n<25){
            System.out.println(-1);
        }else {
            int minR = -1;
            int minC=-1;
            for(int i=5;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    if(n/i>=5){
                        minR = i;
                        minC = n/i;
                        break;
                    }
                }
            }
            if (minC==-1 || minR==-1){
                System.out.println(-1);
            }else {
                char ans[][] = new char[minR][minC];
                for (int i = 0; i < minR; i++) {
                    char str[] = new char[]{'a', 'e', 'i', 'o', 'u'};
                    for (int j = 0; j < minC; j++) {
                        ans[i][j] = (str[(i + j) % 5]);
                    }
                }


                for (int i = 0; i < minR; i++) {
                    for (int j = 0; j < minC; j++) {
                        System.out.print(ans[i][j]);
                    }
                }  System.out.println();

            }


        }

    }
    public static Set<Integer> set = new HashSet<>();
    static int number = (int )1e4+10;

    static void  sieve(int number){
        int [] array = new int[number+1];// n+1 as array is 0 indexed
        Arrays.fill(array, 1);
        array[0]=0;
        array[1]=0;

        for (int i =2;i<=number;i++){
            if (array[i]==1) {
                set.add(i);

                for (int j = 2 * i; j <= number; j += i) {
                    array[j] = 0;
                }
            }
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
