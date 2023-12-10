
import java.util.Scanner;

 class CCSTRMAT {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        scanner.nextLine();
        while (tc-->0){
            String str1 = scanner.next();
            String str2 = scanner.next();
            if (str1.contains(str2)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
