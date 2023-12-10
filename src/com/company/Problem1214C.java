package com.company;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem1214C {
        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) throws IOException {
                int length = scanner.nextInt();
                String str = scanner.next();
                Stack<Character> stack = new Stack<>();

                for (int i =0;i<str.length();i++){
                        char ch  = str.charAt(i);

                        if (stack.size()==0){
                                stack.push(ch);
                        }else if( stack.peek()=='(' && ch==')'){
                                stack.pop();
                        }else stack.push(ch);
                }
                if (stack.size()==0){
                        System.out.println("YES");
                }else if(stack.size()==2 && stack.pop()=='(' && stack.pop()==')'){
                        System.out.println("Yes");
                }else System.out.println("NO");

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
