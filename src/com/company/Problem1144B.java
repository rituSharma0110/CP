import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1144B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int even = 0;
        int odd =0;
        for (int i = 0;i< array.length;i++){
            if (array[i]%2==0){
                even++;
            }else odd++;
        }
        if (Math.abs(even-odd)==1 ||Math.abs(even-odd)==0 ) {
            System.out.println(0);
        }else {
            if (even>odd){
                long sum =0;

                int var = Math.abs(even - odd);
                for (int i =0;i<array.length;i++,var--){
                    if (array[i]%2==0){
                        sum+=array[i];
                    }
                    if (var<=2){
                        break;
                    }

                }
                System.out.println(sum);
            }else if (odd>even){
                long sum =0;

                int var = Math.abs(even - odd);
                for (int i =0;i<array.length;i++,var--){
                    if (array[i]%2==1){
                        sum+=array[i];
                    }
                    if (var<=0){
                        break;
                    }

                }
                System.out.println(sum);
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