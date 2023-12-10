package com.company;
import java.io.*;
import java.util.*;

public class Project1681C {
    static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            int [] aArray = new int[n];
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
            }

           for (int i =0;i<n;i++){
                    aArray[i] = scanner.nextInt();
           }
           ArrayList< int[]> list = new ArrayList<>();
           for (int i =0;i<n;i++){
               for (int j =i+1;j<n;j++){
                   if (array[i]>=array[j] && aArray[i]>=aArray[j]){
                       list.add(new int[]{i+1,j+1});
                       int temp = array[i];
                       array[i] = array[j];
                       array[j] = temp;
                       int temp1 = aArray[i];
                       aArray[i] = aArray[j];
                       aArray[j] = temp1;

                   }
               }

           }
           boolean isPossible = true;

           for (int i =0;i<n-1;i++){
               if (aArray[i]>aArray[i+1]  || array[i]>array[i+1])
                   isPossible = false;
           }
           if (!isPossible){
               out.println(-1);
           }else {
               out.println(list.size());
               for (int i =0;i< list.size();i++){
                   printArray((list.get(i)));
               }
           }

        } out.close();
    }
    static void printArray(int [] array){
        for (int i=0;i< array.length;i++) {
            out.print(array[i] + " ");
        }
        out.println();
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
