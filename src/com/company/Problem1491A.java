
import java.io.*;
import java.util.StringTokenizer;

public class Problem1491A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int number = scanner.nextInt();
        int q = scanner.nextInt();
        int countOne = 0;
        int [] array = new int[number];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
            if (array[i]==1) {
                countOne++;
            }


        }
        while (q-->0){
            int a = scanner.nextInt();
            int k = scanner.nextInt();

            if (a==1){
                array[k-1] = 1-array[k-1];
                if(array[k-1]==0){
                    countOne-=1;
                }else {
                    countOne+=1;
                }
            }else {

                if (k <= countOne) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
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
