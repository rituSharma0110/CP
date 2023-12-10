
import java.util.Scanner;

 class CCEQLIS {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            if (size%2!=0){
                System.out.println("YES");
                for (int i = 1; i <= (size / 2); i++) {
                    System.out.print(i + " ");
                }
                System.out.print(size + " ");
                for (int i = size - 1; i > (size / 2); i--) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }else if (size!=2) {
                System.out.println("YES");
                System.out.print(2 + " ");

                for (int i = 1; i < size / 2; i++) {
                    System.out.print(i + " ");
                }
                for (int i = size ; i > (size / 2); i--) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }else{
                System.out.println("NO");
            }
        }
    }
}
