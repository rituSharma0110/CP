
import java.util.Scanner;

public class AntiLight {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int tc = scanner.nextInt();
        while (tc-->0){
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();
            if (columns==1 && rows ==1){
                System.out.println(0);
            }else if (columns==1||rows==1){
                System.out.println(1);
            }else System.out.println(2);
        }
    }

}
