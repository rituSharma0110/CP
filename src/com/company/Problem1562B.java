package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1562B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            String str = scanner.next();
            int last=-1;
            for(int i=0;i<str.length();i++)
            {
                int var=str.charAt(i)-'0';
                if(var==1 || var==4 || var==6 || var==8 || var==9)
                {
                    last=var;
                    break;
                }
            }
            if(last!=-1)
            {
                System.out.println(1);
                System.out.println(last);
            }
            else
            {
                int ans=0;
                for(int i=0;i<str.length();i++)
                {
                    for(int j=i+1;j<str.length();j++)
                    {
                        String str1=str.charAt(i)+""+str.charAt(j);
                        int val=Integer.valueOf(str1);
                        if(!isPrime(val))
                        {
                            ans=val;
                            break;
                        }
                    }
                }
                System.out.println(2);
                System.out.println(ans);
            }
        }

    }
    public static boolean isPrime(int n)
    {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
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
