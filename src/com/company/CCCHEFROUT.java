
import java.util.Scanner;

 class CCCHEFROUT {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        scanner.nextLine();
     outer:   while (tc-->0){
            String str = scanner.nextLine();
            for (int i=1;i<str.length();i++){
                if (str.charAt(i)<str.charAt(i-1)){
                    System.out.println("no");
                    continue outer;
                }
            }
         System.out.println("yes");
        }
        System.exit(0);
    }
}
